package cn.yesway.hondayesway.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.yesway.hondayesway.util.AppConfig;


public class InitListener extends HttpServlet implements ServletContextListener {

	private static final long serialVersionUID = -5305055162919415411L;
	private static final Logger log = LoggerFactory.getLogger(InitListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.debug("【本田讴歌智驾车载应用服务】 Start.....");
		AppConfig.configure(sce.getServletContext().getRealPath("/") + "/WEB-INF/appconfig.xml");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.debug("【本田讴歌智驾车载应用服务】 End.....");
	}

}
