package com.gcmobile.func.configuration.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gcmobile.func.configuration.eneity.Configuration;
import com.gcmobile.func.configuration.mapper.ConfigurationMapper;


@Service
public class ConfigurationService {

	@Autowired
	private ConfigurationMapper configurationMapper;

	public List<Configuration> queryConfigurationListByType(int type) throws Exception {
		return configurationMapper.queryConfigurationListByType(type);
	}

	
	@Cacheable(value = "queryAllConfigurations")
	public HashMap<Integer, LinkedHashMap<String, Configuration>> queryAllConfigurations() {
		List<Configuration> configurations = configurationMapper.selectAll();

		HashMap<Integer, LinkedHashMap<String, Configuration>> ret = new HashMap<Integer, LinkedHashMap<String, Configuration>>();
		Integer type = null;
		for (Configuration configuration : configurations) {
			if (!ret.containsKey(type = configuration.getType())) {
				ret.put(type, new LinkedHashMap<String, Configuration>());
			}
			ret.get(type).put(configuration.getName(), configuration);
		}

		return ret;
	}
}
