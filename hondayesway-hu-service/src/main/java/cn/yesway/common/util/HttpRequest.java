package cn.yesway.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

public class HttpRequest {
	
	private static final Logger log = LoggerFactory
			.getLogger(HttpRequest.class);
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			
			//connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 获取所有响应头字段
			//Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			// for (String key : map.keySet()) {
			// System.out.println(key + "--->" + map.get(key));
			// }
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream(),"UTF-8"));
			
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}

		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String param,
			Map<String, Object> headers) {
		log.debug("sendPost start - url: " + url + ", param: " + param);
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn =realUrl.openConnection();
			//HttpURLConnection conn =  (HttpURLConnection) 
			/*for (String key : headers.keySet()) {
				conn.setRequestProperty(key, (String) headers.get(key));
			}*/
			conn.setRequestProperty("Content-Type", "text/html;charset=utf-8");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		log.debug("sendPost end");
		return result;
	}

	/**
	 * 向指定 URL 发送默认头文件的POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String param) {
		Map<String, Object> headers = new HashMap<String, Object>();
		// 发送POST请求
		return sendPost(url, param, headers);
	}

	/**
	 * 向指定 URL 发送默认头文件的POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，非法参数将被忽略
	 * @return 所代表远程资源的响应结果
	 * @throws UnsupportedEncodingException 
	 */
	public static String sendPost(String url, Map<String, Object> param) throws UnsupportedEncodingException {
		// 去除非法参数
		param.remove(null);
		param.remove("");
		return sendPost(url,JSONObject.toJSONString(param));
	}
	
	public static String sendpost(String _url, Map<String,Object> param,String token,String obj) throws IOException {
		URL url = new URL(_url);
		//处理param 为json格式 
		
		JSONObject jheader = new JSONObject();
		JSONObject jcontext = new JSONObject();
		jcontext.put("token", token);
		jcontext.put("version", "1.0");
		jheader.put("messageheader", jcontext);
		if(null!= obj&&!"".equals(obj)){
			//加入对象体
			jheader.put(obj, param);
		}else{
			jheader.putAll(param);
		}
		//
		log.debug("out request body :"+jheader.toString());
		URLConnection conn = url.openConnection();
		conn.setDoOutput(true);
		conn.setDoInput(true);
		OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
		writer.write(jheader.toString());
		writer.flush();
		writer.close();
		InputStreamReader reder = new InputStreamReader(conn.getInputStream(), "utf-8");
		BufferedReader breader = new BufferedReader(reder);
		String content = "";
		String result = "";
		while ((content = breader.readLine()) != null) {
			result += content;
		}
		return result;
	}
	public static void main(String[] args) {
//		System.out
//				.println(HttpRequest
//						.sendPost(
//								"http://10.1.11.100:9090/webnotify/notify/send",
//								"channel=/notify/positionMonitor/1/10016&message={\"msg\":\"hello123\"}"));
	}
}