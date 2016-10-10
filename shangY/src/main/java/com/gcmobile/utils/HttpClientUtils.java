package com.gcmobile.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;


import java.io.*;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HttpClientUtils {

	public static String doPost(String url,Map<String,String> map,String charset){

		String result = null;
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		InputStream in = null;
		try {
			if (url.indexOf("https") != -1) {
				KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				in = HttpClientUtils.class.getResourceAsStream("/chinabankpay/key/quick.keystore");
				keyStore.load(in, "chinabank".toCharArray());
				SSLSocketFactory sslSocketFactory = new SSLSocketFactory(keyStore);
				Scheme scheme = new Scheme("https", 443, sslSocketFactory);
				httpClient.getConnectionManager().getSchemeRegistry().register(scheme);
			}
			//设置参数
			List<NameValuePair> list = new ArrayList<>();
			Iterator iterator = map.entrySet().iterator();
			while(iterator.hasNext()){
				Map.Entry<String,String> elem = (Map.Entry<String, String>) iterator.next();
				list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));
			}
			if(list.size() > 0){
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);
				httpPost.setEntity(entity);
			}
			HttpResponse response = httpClient.execute(httpPost);
			if(response != null){
				HttpEntity resEntity = response.getEntity();
				if(resEntity != null){
					result = EntityUtils.toString(resEntity, charset);
				}
			}
		}catch (Exception ex){
			throw new RuntimeException("网络异常!",ex);
		}finally {
			try {
				if(in!=null){
					in.close();
				}
				httpPost.releaseConnection();
				httpClient.getConnectionManager().shutdown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private static final String url = "https://quick.chinabank.com.cn/express.htm";

	public static String process(String charset, String req) {
		String resp = null;
		HttpClient httpClient = null;
		HttpPost httpPost = null;
		InputStream in = null;
		try {
			httpClient = new DefaultHttpClient();
			httpPost = new HttpPost(url);

			if (url.indexOf("https") != -1) {
				KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
				//in = HttpClientUtils.class.getClassLoader().getResourceAsStream("chinabankpay/key/quick.keystore");
				String url = HttpClientUtils.class.getResource("").getPath();
				String path = url.substring(0, url.indexOf("WEB-INF")) + "WEB-INF";
				in = new FileInputStream(new File(path+"/classes/chinabankpay/key/quick.keystore"));
				keyStore.load(in, "chinabank".toCharArray());
				SSLSocketFactory sslSocketFactory = new SSLSocketFactory(keyStore);
				Scheme scheme = new Scheme("https", 443, sslSocketFactory);
				httpClient.getConnectionManager().getSchemeRegistry().register(scheme);
			}
			HttpParams httpParams = httpClient.getParams();
			httpParams.setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,1000 * 60);
			httpParams.setIntParameter(CoreConnectionPNames.SO_TIMEOUT, 1000 * 60);
			List<NameValuePair> reqPair = new ArrayList<>();
			reqPair.add(new BasicNameValuePair("charset", charset));
			reqPair.add(new BasicNameValuePair("req", req));
			UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(reqPair,charset);
			httpPost.setEntity(urlEncodedFormEntity);
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				InputStream is = responseEntity.getContent();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int ch = 0;
				while ((ch = is.read(buffer)) != -1) {
					baos.write(buffer, 0, ch);
				}
				byte bytes[] = baos.toByteArray();
				resp = new String(bytes, charset);
			}

			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				throw new Exception(response.getStatusLine().toString() + "|"+ resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null){
					in.close();
				}
				httpPost.releaseConnection();
				httpClient.getConnectionManager().shutdown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return resp;
	}
}
