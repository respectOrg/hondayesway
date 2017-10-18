package cn.yesway.hondayesway.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.yesway.common.soap.shorturlhandlerservice.IShortURLHandlerService;
import cn.yesway.common.soap.smsservice.Sms;
import cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType;
import cn.yesway.common.util.Environment;
import cn.yesway.hondayesway.dao.FeePlanDao;
import cn.yesway.hondayesway.dao.ServicesStatusDao;
import cn.yesway.hondayesway.dao.SettlementDao;
import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.MultipleActivationException;
import cn.yesway.hondayesway.service.SettlementService;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.util.AppConfig;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.DateUtils;
import cn.yesway.hondayesway.util.UuidUtils;
import cn.yesway.hondayesway.vo.FeePlan;
import cn.yesway.hondayesway.vo.ServiceStatus;
import cn.yesway.hondayesway.vo.Settlement;

import com.alibaba.fastjson.JSONObject;

@Service
public class SettlementServiceImpl implements SettlementService {

	private final Logger log = LoggerFactory.getLogger(SettlementServiceImpl.class);

	@Autowired
	ServicesStatusDao servicesStatusDao;
	@Autowired
	FeePlanDao feePlanDao;
	@Autowired
	SettlementDao settlementDao;
	@Autowired
	UserService userService;

	/* webservice */
	@Autowired
	WebShortMessageSoap_PortType smsService;
	@Autowired
	IShortURLHandlerService shortUrlService;

	@Override
	public List<ServiceStatus> getList(String vin,String language) {
		List<ServiceStatus> list = servicesStatusDao.getList(vin,language);
		for (ServiceStatus item : list) {
			Date now = new Date();
			if (item.getEndDate() == null) {
				// 判断未订购
				item.setServiceStatus(0);
			} else if (item.getEndDate().getTime() < now.getTime()) {
				// 判断过期
				item.setServiceStatus(2);
			} else if (DateUtils.getNextMonthDate(item.getEndDate(), 0, 0, -7).getTime() < now.getTime()) {
				// 即将过期7天内过期
				item.setServiceStatus(4);
			}
		}
		return list;
	}

	@Override
	public ServiceStatus get(String vin, String serviceId,String language) {
		ServiceStatus ss = servicesStatusDao.getServiceStatus(vin, serviceId,language);
		if (ss == null) {
			return ss;
		}
		Date now = new Date();
		if (ss.getEndDate() == null) {
			// 判断未订购
			ss.setServiceStatus(0);
		} else if (ss.getEndDate().getTime() < now.getTime()) {
			// 判断过期
			ss.setServiceStatus(2);
		} else if (DateUtils.getNextMonthDate(ss.getEndDate(), 0, 0, -7).getTime() < now.getTime()) {
			// 即将过期7天内过期
			ss.setServiceStatus(4);
		}
		return ss;
	}

	@Override
	public int updateServiceStatus(ServiceStatus serviceStatus) {
		return servicesStatusDao.update(serviceStatus);
	}

	@Override
	public List<FeePlan> getFeePlan(String serviceId,String language) {
		return feePlanDao.get(serviceId,language);
	}

	@Override
	public int addSettlement(Settlement settlement) {
		settlement.setSettlementId(UuidUtils.getUUID());
		return settlementDao.add(settlement);
	}

	@Override
	public int updateSettlement(Settlement settlement) {
		return settlementDao.update(settlement);
	}

	@Override
	public int addServiceStatus(ServiceStatus serviceStatus) {
		serviceStatus.setServiceStatusId(UuidUtils.getUUID());
		return servicesStatusDao.add(serviceStatus);
	}

	@Override
	public ServiceStatus activateService(String vin, String serviceId,String language) throws BaseMessageException {
		// 根据vin 和 serviceid 查询服务状态 如果返回结果为空 就是未激活,然后激活在服务状态表加入一条新的免费服务记录
		ServiceStatus s = null;
		s = servicesStatusDao.get(vin, serviceId,language);
		if (null != s) {
			// 有记录返回重复激活异常
			throw new MultipleActivationException("重复激活", ExceptionLanguage.USER_ACTIVE_ERROR_MULTIPLE);
		} else {
			// 没有记录则从计费策略表中找出免费的一条记录 写入服务状态表
			List<FeePlan> list = feePlanDao.get(serviceId,language);
			for (FeePlan f : list) {
				if (f.getType() == 2) {
					// 如果是免费代餐那么讲信息获取新增如服务状态表中
					ServiceStatus ss = new ServiceStatus();
					ss.setServiceStatusId(UuidUtils.getUUID());
					ss.setServiceId(serviceId);
					ss.setVin(vin);
					ss.setServiceStatus(1);
					Date dt = new Date();
					ss.setStartDate(dt);
					// 设置当前时间num个月后的时间 免费套餐一般按月计算
					ss.setEndDate(DateUtils.getNextMonthDate(dt, 0, f.getMonths(), 0));
					servicesStatusDao.add(ss);
					//2016年4月25日 10:28:26  修改 。激活礼宾业务，修改到期时间
					if("1002".equals(ss.getServiceId())){
						userService.updateUserEndDate(vin, DateUtils.Date2Calendar(ss.getEndDate()));
					}
					break;
				}
			}
		}
		return servicesStatusDao.getServiceStatus(vin, serviceId,language);
	}

	@Override
	public Settlement getSettlementById(String settlementId) {
		return settlementDao.getById(settlementId);
	}

	@Override
	@Transactional
	public void settlementCallBack(String settlementId, int payStatus,String language) throws Exception {
		log.info("SettlementServiceImpl settlementCallBack ->settlementId=" + settlementId + "&payStatus=" + payStatus);
		// 查找订单
		if (StringUtils.isBlank(settlementId)) {
			log.info("settlementCallBack -> settlementId is null");
			throw new Exception("请求的订单ID有误！");
		}
		Settlement s = settlementDao.getById(settlementId);
		if (null == s) {
			log.info("settlementCallBack ->Settlement is null");
			throw new Exception("请求的订单不存在！");
		}
		if (s.getPayStatus() == payStatus) {
			log.info("settlementCallBack -> repeat request, skip");
			return;
		}
		log.info("settlementCallBack ->Settlement: " + s.toString());
		s.setPayStatus(payStatus);
		s.setPayDate(new Date());
		if (settlementDao.update(s) < 1) {
			log.info("settlementCallBack -> update Settlement throw exception");
			throw new Exception("订单处理异常！");
		}

		ServiceStatus ss = servicesStatusDao.get(s.getVin(), s.getServiceId(),language);
		FeePlan plan = feePlanDao.getById(s.getFeeCode());
		int month = plan.getMonths();

		Date now = new Date();
		if (null == ss) {
			log.info("settlementCallBack ->before add ServiceStatus");
			ss = new ServiceStatus();
			ss.setVin(s.getVin());
			ss.setAddTime(now);
			ss.setCancelDate(null);
			ss.setServiceId(s.getServiceId());
			ss.setServiceName(s.getServiceName());
			ss.setServiceStatus(ServiceStatus.ServiceStatusType.NORMAL);
			ss.setServiceStatusId(UUID.randomUUID().toString());
			ss.setStartDate(now);
			ss.setEndDate(DateUtils.getNextMonthDate(now, 0, month, 0));
			if (servicesStatusDao.add(ss) < 1) {
				throw new Exception("服务记录新增异常！");
			}
			log.info("SettlementServiceImpl settlementCallBack -> add success ServiceStatus:" + ss.toString());
		} else {
			log.info("SettlementServiceImpl settlementCallBack -> before update ServiceStatus: " + ss.toString());
			ss.setServiceStatus(ServiceStatus.ServiceStatusType.NORMAL);
			ss.setStartDate(ss.getEndDate().getTime() > now.getTime() ? ss.getStartDate() : now);
			Date endDate = ss.getEndDate().getTime() > now.getTime() ? DateUtils.getNextMonthDate(ss.getEndDate(), 0, month, 0) : DateUtils.getNextMonthDate(now, 0, month, 0);
			ss.setEndDate(endDate);
			if (servicesStatusDao.update(ss) < 1) {
				throw new Exception("服务记录更新异常！");
			}
			log.info("SettlementServiceImpl settlementCallBack -> update  success ServiceStatus:" + ss.toString());
		}
		
		//2016年4月25日 10:28:26  修改 。激活礼宾业务，修改到期时间,
		if("1002".equals(ss.getServiceId())){
			userService.updateUserEndDate(s.getVin(), DateUtils.Date2Calendar(ss.getEndDate()));
		}
	}

	// 获取短链接
	public String getShortUrl(String longUrl) throws Exception {
		log.info("SettlementServiceImpl getShortUrl  start->longUrl=" + longUrl);
		String ret = longUrl;
		try{
		String shortUrl = shortUrlService.createShortURL(longUrl, 1001, "本田讴歌智驾缴费短信发送");
		String shortUrlDomain = AppConfig.getParameter("shorturl.domain");
		ret = shortUrlDomain + shortUrl;
		log.info("SettlementServiceImpl getShortUrl  end->shortUrl=" + ret);
		}catch(Exception e){
			log.info("SettlementServiceImpl getShortUrl  error", e);
		}
		return ret;
	}

	@Override
	public String sendSettlementSms(String vin, String feeCode, String phoneNumber) throws Exception {
		log.info("sendSettlementSms  start-> vin=" + vin + "&feeCode=" + feeCode + "&phoneNumber=" + phoneNumber);
		FeePlan feePlan = feePlanDao.getById(feeCode);
		if (null == feePlan) {
			log.info("sendSettlementSms add settlement recorde-> not found FeePlan by feeCode,skip");
			throw new Exception("没有找到feeCode=" + feeCode + "的套餐记录");
		}
		Settlement s = new Settlement();
		s.setSettlementId(UUID.randomUUID().toString());
		s.setServiceId(feePlan.getServiceId());
		s.setVin(vin);
		s.setFeeCode(feeCode);
		s.setPayStatus(1);
		s.setPayDate(null);
		s.setPayAmount(feePlan.getPrice());
		s.setPayMethod(0);
		s.setAddTime(new Date());
		log.info("sendSettlementSms add settlement recorde-> settlement:" + s.toString());
		if (settlementDao.add(s) <= 0) {
			log.info("sendSettlementSms add settlement recorde -> add failed");
			throw new Exception("新增Settlement记录失败");
		}
		log.info("sendSettlementSms add settlement recorde -> add success");
		log.info("sendSettlementSms sendMsg start");
		// 获取短信模板并填充
		String smsTemplate = AppConfig.getParameter(Environment.SMS_TEMPLATE);
		String longUrl = AppConfig.getParameter(Environment.SMS_PAYLONGURL) + s.getSettlementId();// 长支付链接

		String payUrl = getShortUrl(longUrl);
		smsTemplate = smsTemplate.replaceAll("\\{\\{payUrl\\}\\}", payUrl);
		log.info("sendSettlementSms sendMsg -> smsContent:" + smsTemplate);
		// 发送短信
		sendSms(phoneNumber, smsTemplate);
		return s.getSettlementId();
	}

	private void sendSms(String phoneNumber, String smsContent) throws Exception {
		Integer channel = 0;
		String preNo = phoneNumber.substring(0, 3);
		if(AppConfig.getParameter(Environment.SMS_CHINAMOBILE_NO).indexOf(preNo) > 0){
			channel = Integer.parseInt(AppConfig.getParameter(Environment.SMS_CHINAMOBILE_CHANNEL));
		} else if(AppConfig.getParameter(Environment.SMS_CHINAUNICOM_NO).indexOf(preNo) > 0){
			channel = Integer.parseInt(AppConfig.getParameter(Environment.SMS_CHINAUNICOM_CHANNEL));
		} else if(AppConfig.getParameter(Environment.SMS_CHINATELECOM_NO).indexOf(preNo) > 0){
			channel = Integer.parseInt(AppConfig.getParameter(Environment.SMS_CHINATELECOM_CHANNEL));
		}
		Sms s = new Sms();
		s.setAppid(Integer.parseInt(AppConfig.getParameter(Environment.SMS_APPID)));
		s.setSrc(AppConfig.getParameter(Environment.SMS_SRC));
		s.setPwd(AppConfig.getParameter(Environment.SMS_PWD));
		s.setLogo(AppConfig.getParameter(Environment.SMS_LOGO));
		s.setChannle(channel);
		s.setDest(phoneNumber);
		s.setContent(smsContent);
		
		log.info("== send SMS : " + JSONObject.toJSONString(s));
		int result = smsService.sendText(s);
		log.info("== send SMS - " + result);
		
	}

	public static void main(String[] args) {
		System.out.println(DateTimeUtils.getDateTimeStr(DateUtils.getNextMonthDate(new Date(), 0, 1, -1)));
		System.out.println(DateTimeUtils.getDateTimeStr(DateUtils.getNextMonthDate(new Date(), 0, 1, 0)));
		//System.out.println("186111".substring(0, 3));
		
	}
}
