package cn.yesway.hondayesway.headunit.interceptor;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

public class ProtocolAuthInterceptor implements HandlerInterceptor{
	private static final Logger log = LoggerFactory.getLogger(ProtocolAuthInterceptor.class);

	

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if(request.getRequestURI().contains("/position/last/get")){
			int size = request.getContentLength();
			InputStream in = request.getInputStream();
			byte[] reqBodyBytes = this.readBytes(in, size);
			String requestBody = new String(reqBodyBytes, "utf-8");
			log.info("request body:"+requestBody);
			request.setAttribute("data", JSONObject.parse(requestBody));
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
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
}
