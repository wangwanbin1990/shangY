package com.gcmobile.func.configuration.mapper;

import java.util.List;

import com.gcmobile.func.configuration.eneity.Configuration;


public interface ConfigurationMapper {
	
	List<Configuration> selectAll();
	public List<Configuration> queryConfigurationListByType(int type) throws Exception;

}