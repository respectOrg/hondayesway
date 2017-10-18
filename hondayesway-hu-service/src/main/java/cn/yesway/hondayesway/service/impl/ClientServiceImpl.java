package cn.yesway.hondayesway.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.hondayesway.dao.ClientAppDao;
import cn.yesway.hondayesway.dao.ParamDao;
import cn.yesway.hondayesway.service.ClientService;
import cn.yesway.hondayesway.vo.ClientApp;
import cn.yesway.hondayesway.vo.Param;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientAppDao clientAppDao;
	
	@Autowired
	ParamDao paramDao;
	
	@Override
	public ClientApp getVersion(String appkey,String language) {
		return clientAppDao.get(appkey,language);
	}

	@Override
	public List<Param> getLatestParams() {
		return paramDao.get();
	}
	//新增配置项
	public int addParams(Param pam){
		return paramDao.add(pam);
	}
}
