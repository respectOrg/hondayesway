package cn.yesway.hondayesway.util;

import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class SecurityUtils {
	/**
	 * AES加密
	 * 
	 * @param content
	 *            待加密的内容
	 * @param encryptKey
	 *            加密密钥
	 * @return 加密后的byte[]
	 * @throws Exception
	 */
	public static byte[] aesEncrypt(byte[] content, String key) throws Exception {
		
		KeySpec keySpec = new PBEKeySpec(key.toCharArray(), key.getBytes(), 1000, 128);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("pbkdf2withhmacsha1");
		byte[] keyByte = keyFactory.generateSecret(keySpec).getEncoded();

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyByte, "AES"));

		return cipher.doFinal(content);
	}

	/**
	 * AES解密
	 * 
	 * @param encryptBytes
	 *            待解密的byte[]
	 * @param decryptKey
	 *            解密密钥
	 * @return 解密后的String
	 * @throws Exception
	 */
	public static byte[] aesDecrypt(byte[] content, String key) throws Exception {
		
		KeySpec keySpec = new PBEKeySpec(key.toCharArray(), key.getBytes(), 1000, 128);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("pbkdf2withhmacsha1");
		byte[] keyByte = keyFactory.generateSecret(keySpec).getEncoded();

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyByte, "AES"));

		return cipher.doFinal(content);
	}

	public static void main(String[] args) throws Exception {
		String content = "E10ADC3949BA59ABBE56E057F20F883E";
		String key = "789012";
		byte[] aa = SecurityUtils.aesEncrypt(content.getBytes(), key);
		//System.out.println(ByteUtils.getHexString(aa));
		System.out.println(new String(SecurityUtils.aesDecrypt(aa, key)));
	}

}
