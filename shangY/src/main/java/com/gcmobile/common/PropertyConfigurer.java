package com.gcmobile.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

public class PropertyConfigurer {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	private static Properties props = new Properties();;
	private Resource[] locations;

	public PropertyConfigurer() {
	}

	/**
	 * @Title: getValue
	 * @Description: 通过key获取属性文件的值
	 * @param String key
	 * @return String 返回类型
	 * @throws
	 */
	public static String getValue(String key) {
		try {
			return new String(props.getProperty(new String(key.getBytes("utf-8"), "iso-8859-1"), "").getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		return "";
	}

	public void load() {
		if (this.locations != null) {
			for (Resource location : this.locations) {
				if (this.logger.isInfoEnabled()) {
					this.logger.info("Loading properties file from " + location);
				}
				InputStream is = null;
				try {
					is = location.getInputStream();
					props.load(is);
				} catch (IOException e) {
					if (this.logger.isWarnEnabled()) {
						this.logger.warn("Could not load properties from " + location + ": " + e.getMessage());
					}
				} finally {
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
						}
					}
				}
			}
		}
	}

	public void setLocations(Resource[] locations) {
		this.locations = locations;
	}
}
