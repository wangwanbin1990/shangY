package com.sy.security;

import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Description:ticket的加解密<br />
 * </p>
 * 
 * @title TicketCryptor.java
 * @package com.cxdai.bbs.security
 * @author qiongbiao.zhang
 * @version 0.1 2014年7月25日
 */
public class TicketCryptor {
	private static final Logger logger = LoggerFactory.getLogger(TicketCryptor.class);

	public static final char SPLIT = '|';
	private static final String KEY_ALGORITHM = "AES";
	private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS7Padding";
	private static final String CIPHER_PROVIDER = "BC";
	private static final String UTF_8 = "utf-8";
	private static final char[] PAD = "gcjr".toCharArray();
	private static final byte[] KEY = getBytes("国诚金融gcjr");
	
	public static String encrypt(String ticket)  {
	
		byte[] data = null, encrypt = null;
		if ((data = strPad(ticket)) == null) {
			return null;
		}
		if ((encrypt = encrypt(data, KEY)) == null) {
			return null;
		}
		return new String(Base64.encodeBase64(encrypt));
	}

	public static String decrypt(String ticket) {
		if (ticket == null || ticket.length() == 0) {
			return null;
		}
		byte[] decrypt = decrypt(Base64.decodeBase64(ticket), KEY);
		if (decrypt == null) {
			return null;
		}
		return new String(decrypt);
	}
	
	private static byte[] getBytes(String str) {
		try {
			return str.getBytes(UTF_8);
		} catch (Exception e) {
			// ignore
		}
		return null;
	}
	
	// 填充
	private static byte[] strPad(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		try {
			StringBuilder sb = new StringBuilder(16 + 14).append(str).append(SPLIT).append(System.currentTimeMillis());
			int len = getBytes(str).length;
			if (len < 16) {
				sb.insert(0, SPLIT);
				len++;

				while (len < 16) {
					for (char ch : PAD) {
						if (len == 16) {
							break;
						}
						sb.insert(0, ch);
						len++;
					}
				}
			}
			return getBytes(sb.toString());
		} catch (Exception e) {
			logger.error("UnsupportedEncodingException occurred", e);
		}
		return null;
	}

	// 加密
	private static byte[] encrypt(byte[] data, byte[] key) {
		try {
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM, CIPHER_PROVIDER);
			cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, KEY_ALGORITHM));
			return cipher.doFinal(data);
		} catch (Exception e) {
			logger.error("encryption failed.", e);
		}
		return null;
	}

	// 解密
	private static byte[] decrypt(byte[] data, byte[] key) {
		try {
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM, CIPHER_PROVIDER);
			cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, KEY_ALGORITHM));
			return cipher.doFinal(data);
		} catch (Exception e) {
			logger.error("decryption failed.", e);
		}
		return null; 
	}
	
	 public static void main(String[] args) {  
		 
		 String aa =TicketCryptor.encrypt("haha");
		 System.out.println(aa);
		 System.out.println(TicketCryptor.decrypt("dB4SmfiOTQpspWI1QCnJww0xYE7BahJRXuPJWNQ46Mlzo2C2GVQZOpeWpZr1gn0XXALPtBO2aJrTDetxarPvNw=="));
	 }
}