package com.sy.func.configuration.mapper;

import java.util.List;

import com.sy.func.configuration.eneity.Configuration;


public interface ConfigurationMapper {
	
	List<Configuration> selectAll();
	public List<Configuration> queryConfigurationListByType(int type) throws Exception;

}