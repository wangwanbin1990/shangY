package com.gcmobile.common;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcmobile.func.configuration.eneity.Configuration;
import com.gcmobile.func.configuration.service.ConfigurationService;

public class Dictionary {
	private static final Logger logger = Logger.getLogger(Dictionary.class);

	private static Dictionary _THIS;

	@Autowired
	private ConfigurationService configurationService;

	@Autowired
	private org.springframework.cache.CacheManager cacheManager;

	public void init() {
		_THIS = this;
		//_THIS.configurationService.queryAllConfigurations();
	}

	private static final LinkedHashMap<String, Configuration> getConfigurationMap(Integer type) {
		try {
			return _THIS.configurationService.queryAllConfigurations().get(type);
		} catch (Exception e) {
			logger.error("dictionary error", e);
			return null;
		}
	}

	public static final Collection<Configuration> getValues(Integer type) {
		LinkedHashMap<String, Configuration> map = getConfigurationMap(type);
		if (map != null && !map.isEmpty()) {
			return map.values();
		}
		return Collections.emptyList();
	}

	public static final String getValue(String type, String name) {
		try {
			return getValue(Integer.valueOf(type), name);
		} catch (Exception e) {
			return "";
		}
	}

	public static final String getValue(Integer type, String name) {
		LinkedHashMap<String, Configuration> map = getConfigurationMap(type);
		if (map != null && !map.isEmpty()) {
			Configuration configuration = map.get(name);
			if (configuration != null) {
				return configuration.getValue();
			}
		}
		return "";
	}

	public static void cleanUp() {
		_THIS.cacheManager.getCache("queryAllConfigurations").clear();
	}
}
