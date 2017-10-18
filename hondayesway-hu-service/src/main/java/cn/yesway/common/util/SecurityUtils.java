package cn.yesway.common.util;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;

public class SecurityUtils {
    public static Boolean rightSign(HttpServletRequest request, String userSecurityKey) throws Exception {
        String key = request.getParameter("key");
        String serviceKey = request.getParameter("servicekey");
        String timestamp = request.getParameter("timestamp");
        String sign = request.getParameter("sign");

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", key);
        params.put("serviceKey", serviceKey);
        params.put("timestamp", timestamp);

        String mySign = new String(Base64.encodeBase64(HmacSHA1Encrypt(createLinkString(params), userSecurityKey)));

        return sign.equals(mySign);
    }

    /**
     * 获取将参数按字典序拼接的字符串
     *
     * @param params
     *            需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, Object> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = params.get(key);
            stringBuilder = stringBuilder.append(key + "=" + value);
        }
        return stringBuilder.toString();
    }

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名
     *
     * @param encryptText
     *            被签名的字符串
     * @param encryptKey
     *            密钥
     * @return
     * @throws Exception
     */
    public static byte[] HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception {
        byte[] data = encryptKey.getBytes("UTF-8");
        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
        SecretKey secretKey = new SecretKeySpec(data, "HmacSHA1");
        // 生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance("HmacSHA1");
        // 用给定密钥初始化 Mac 对象
        mac.init(secretKey);

        byte[] text = encryptText.getBytes("UTF-8");
        // 完成 Mac 操作
        return mac.doFinal(text);
    }
    public static String getWeek(Date date) {
        String[] weeks = { "6", "0", "1", "2", "3", "4", "5" };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week_index < 0) {
            week_index = 0;
        }
        return weeks[week_index];
    }
    public static void main(String[] args) throws Exception {
        String key = "ycpspTestUser";
        String serviceKey = "ycpsp@testproject";
        String timestamp = System.currentTimeMillis()+"";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", key);
        params.put("servicekey", serviceKey);
        params.put("timestamp", timestamp);
        byte [] bts = HmacSHA1Encrypt(createLinkString(params), "Yesway95190");
        String mySign = new String(Base64.encodeBase64(bts));
        params.put("sign", mySign);
        //String url = "http://192.168.104.56:8080/ycpsp-gateway/api/token";
		/*String s = HttpRequest.sendGet(url, "key="+key+"&servicekey="+serviceKey+"&timestamp="+timestamp+"&sign="+mySign);
		System.out.println("response="+s);
		System.out.println(timestamp);
		System.out.println(mySign);*/
    }

}
