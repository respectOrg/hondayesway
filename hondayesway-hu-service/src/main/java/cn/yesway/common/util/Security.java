package cn.yesway.common.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Security {

	public static String encrypt(String strSrc, String encName)
			throws NoSuchAlgorithmException {
		MessageDigest md = null;
		String strDes = null;

		byte[] bt = null;
		try {
			bt = strSrc.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (encName == null || encName.equals("")) {
			encName = "MD5";
		}
		md = MessageDigest.getInstance(encName);
		md.update(bt);
		strDes = byte2hex(md.digest());
		return strDes;
	}

	// DES,DESede,Blowfish

	// keybyte为加密密钥，长度为24字节
	// src为被加密的数据缓冲区（源）
	// algorithm加密算法
	public static byte[] encryptMode(byte[] keybyte, byte[] src,
			String algorithm) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {
		// 生成密钥
		SecretKey deskey = new SecretKeySpec(keybyte, algorithm);

		// 加密
		Cipher c1 = Cipher.getInstance(algorithm);
		c1.init(Cipher.ENCRYPT_MODE, deskey);
		return c1.doFinal(src);
	}

	// keybyte为加密密钥，长度为24字节
	// src为加密后的缓冲区
	// algorithm加密算法
	public static byte[] decryptMode(byte[] keybyte, byte[] src,
			String algorithm) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException {

		// 生成密钥
		SecretKey deskey = new SecretKeySpec(keybyte, algorithm);

		// 解密
		Cipher c1 = Cipher.getInstance(algorithm);
		c1.init(Cipher.DECRYPT_MODE, deskey);
		return c1.doFinal(src);
	}

	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0xFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs;
	}

	public static void main(String[] args) {
		try {
			// MD5是16位,SHA是20位（这是两种报文摘要的算法）
			String originalPwd = "an";
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			// MessageDigest messageDigest=MessageDigest.getInstance("SHA-1");

			messageDigest.update(originalPwd.getBytes());
			// 得到的是个二进制byte数组，有可能某些byte是不可打印的字符。
			byte[] digest = messageDigest.digest();

			// 转换成Base64编码保存
			/*
			 * String digestedPwdString_base64 = new String(Base64.encode(digest));
			   System.out.println("digestedPwdString_base64:"+ digestedPwdString_base64);
			*/

			// 转换成16进制字符串保存
			String digestedPwdString_hex = byte2hex(digest);
			System.out
					.println("digestedPwdString_hex:" + digestedPwdString_hex);

			System.out.println("encrypt:" + encrypt(originalPwd, "MD5"));

			/** ********************************************************* */
			// 支技DES,DESede,Blowfish三种加密算法
			String algorithm = "DESede";
			// 24字节的密钥
			final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88,
					0x10, 0x40, 0x38, 0x28, 0x25, 0x79, 0x51, (byte) 0xCB,
					(byte) 0xDD, 0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98,
					0x30, 0x40, 0x36, (byte) 0xE2 };
			String szSrc = "This is a 3DES test. 测试";

			System.out.println("加密前的字符串:" + szSrc);

			byte[] encoded = encryptMode(keyBytes, szSrc.getBytes(), algorithm);
			System.out.println("加密后的字符串:" + new String(encoded));

			byte[] srcBytes = decryptMode(keyBytes, encoded, algorithm);
			System.out.println("解密后的字符串:" + (new String(srcBytes)));

		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
