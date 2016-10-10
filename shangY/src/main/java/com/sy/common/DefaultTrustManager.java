package com.sy.common;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * x509 提供支持https请求
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title DefaultTrustManager.java
 * @package com.cxdai.wx.common
 * @author Wang Bo
 * @version 0.1 2014年11月14日
 */
public class DefaultTrustManager implements X509TrustManager {
	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
}
