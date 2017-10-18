package cn.yesway.hondayesway.headunit.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InvalidParamException;
import cn.yesway.hondayesway.exception.NoSuchVinException;
import cn.yesway.hondayesway.headunit.service.AuthenticationService;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.vo.User;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
	@Autowired
	UserService userService;
	
	@Override
	public void authParams(String... params) throws Exception {
		for (String param : params) {
			if (StringUtils.isBlank(param)) {
				throw new InvalidParamException("必要的参数为空",ExceptionLanguage.INVALID_PARAM_EXCEPTION_NECESSARYPARAMNULL);
			}
		}

	}

	@Override
	public void authNull(Object... params) throws Exception {
		for (Object param : params) {
			if (param == null) {
				throw new InvalidParamException("必要的参数为空",ExceptionLanguage.INVALID_PARAM_EXCEPTION_NECESSARYPARAMNULL);
			}
		}
	}
	
	@Override
	public User authVin(String vin) throws Exception {
		if(StringUtils.isBlank(vin)){
			throw new InvalidParamException("缺少参数：vin",ExceptionLanguage.INVALID_PARAM_EXCEPTION_MISSINGVIN);
		}
		if(vin.length() > 17){
			throw new InvalidParamException("vin过长",ExceptionLanguage.INVALID_PARAM_EXCEPTION_VINTOLONG);
		}
		User user = userService.get(vin);
		if(user == null){
			throw new NoSuchVinException("vin不存在",ExceptionLanguage.INVALID_PARAM_EXCEPTION_VINNOTEXIST);
		}
		return user;
	}

	@Override
	public Double convertDouble(String number) throws Exception {
		try{
			return Double.valueOf(number);
		} catch (Exception e){
			throw new InvalidParamException("参数类型错误",ExceptionLanguage.INVALID_PARAM_EXCEPTION_TYPEEROR);
		}
	}

	@Override
	public Integer convertInteger(String number) throws Exception {
		try{
			return Integer.valueOf(number);
		} catch (Exception e){
			throw new InvalidParamException("参数类型错误",ExceptionLanguage.INVALID_PARAM_EXCEPTION_TYPEEROR);
		}
	}

}
