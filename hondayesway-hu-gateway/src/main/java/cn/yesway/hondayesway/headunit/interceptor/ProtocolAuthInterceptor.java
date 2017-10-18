package cn.yesway.hondayesway.headunit.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InvalidParamException;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderRequest;
import cn.yesway.hondayesway.util.AppConfig;

import com.alibaba.fastjson.JSONObject;

public class ProtocolAuthInterceptor implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(ProtocolAuthInterceptor.class);

	@Autowired
	GwLanguageService gwLanguageService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		StringBuilder buf = new StringBuilder();
		
		// 获取body内容
		int size = request.getContentLength();
		InputStream in = request.getInputStream();
		byte[] reqBodyBytes = this.readBytes(in, size);
		String requestBody = new String(reqBodyBytes, "utf-8");
		
		buf.append("\n===================================\r\n");
		buf.append("REQUEST_ADDRESS: ").append(request.getRemoteAddr()).append("\r\n");
		buf.append("REQUEST_METHOD: ").append(request.getMethod()).append("\r\n");
		buf.append("REQUEST_URI: ").append(request.getRequestURI()).append("\r\n");
		buf.append("REQUEST_CHARACTERENCODING: ").append(request.getCharacterEncoding()).append("\r\n");
		buf.append("REQUEST_QUERYSTRING: ").append(request.getQueryString()).append("\r\n\r\n");
		buf.append("REQUEST_HEADER: \n").append(getHeader(request)).append("\r\n");
		buf.append("REQUEST_CONTENT: \n").append(requestBody).append("\r\n");;
		buf.append("===================================\r\n");
		log.debug(buf.toString());
		if(request.getMethod().equals("GET")){
			return true;
		}
		// Basic验证
		try{
			String authorization = request.getHeader("authorization");
			if (StringUtils.isBlank(authorization) || authorization.split(" ").length != 2) {
				throw new Exception("Basic Authorization Failed!");
			}
			authorization = authorization.split(" ")[1];
			String basic64code = new String(Base64.decodeBase64(authorization));
			if(!basic64code.equals(AppConfig.getParameter("access.account"))){
				throw new Exception("Basic Authorization Failed!");
			}
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			log.error("RESPONSE_HTTPSTATUS: " + HttpServletResponse.SC_UNAUTHORIZED, e);
			return false;
		}

		// 协议鉴权
		MessageHeaderRequest messageheader = null;
		JSONObject messageJSON = null;
		try {
			messageJSON = JSONObject.parseObject(requestBody);
			messageheader = JSONObject.parseObject(messageJSON.getString("messageheader"), MessageHeaderRequest.class);
			if (messageheader == null) {
				throw new Exception();
			}
			messageheader.setClientlanguage(StringUtils.isBlank(messageheader.getClientlanguage()) ? "zh" : messageheader.getClientlanguage());
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			log.error("RESPONSE_HTTPSTATUS: " + HttpServletResponse.SC_BAD_REQUEST, e);
			return false;
		}

		Map<String, Object> map = new HashMap<String, Object>();
		try {
			// 验证协议头
			if (messageheader == null || StringUtils.isBlank(messageheader.getTimestamp()) || StringUtils.isBlank(messageheader.getVin()) || StringUtils.isBlank(messageheader.getVersion())) {
				throw new InvalidParamException("消息头不完整",ExceptionLanguage.REQUEST_EXCEPTION_REQUEST_HEADER_INCOMPLETE);
			}
		} catch (Exception e) {
			log.error(e.toString(), e);
			map.put("messageheader", gwLanguageService.process(e, messageheader.getClientlanguage()));
			String responseStr = JSONObject.toJSONString(map);
			log.debug("RESPONSE_CONTENT: " + responseStr);
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print(responseStr);
			out.flush();
			out.close();
			return false;
		}
		request.setAttribute("messageheader", messageheader);
		request.setAttribute("data", messageJSON.get("data"));
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

	private byte[] readBytes(InputStream in, int contentLen) {
		if (contentLen > 0) {
			int readLen = 0;
			int readLengthThisTime = 0;
			byte[] message = new byte[contentLen];

			try {
				while (readLen != contentLen) {
					readLengthThisTime = in.read(message, readLen, contentLen - readLen);
					if (readLengthThisTime == -1) {
						break;
					}
					readLen += readLengthThisTime;
				}
				return message;
			} catch (IOException e) {
			}
		}
		return new byte[]{};
	}

	private String getHeader(HttpServletRequest request) {
		StringBuffer buf = new StringBuffer();
		Enumeration<?> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			buf.append(key).append(" = ").append(value).append("\r\n");
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		String encode = new String(Base64.encodeBase64("honda:yesway".getBytes()));
		System.out.println(encode);
		System.out.println(new String(Base64.decodeBase64(encode)));
	}
}
