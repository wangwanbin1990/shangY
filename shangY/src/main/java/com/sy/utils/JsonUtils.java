package com.sy.utils;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	private static final Logger logger = Logger.getLogger(JsonUtils.class);

	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static <T> T json2Bean(String json, Class<T> clazz) {
		if (json == null) {
			return null;
		}
		try {
			// 忽略在json中有在bean中没有的属性
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			logger.error("unconverted json[" + json + "]", e);
		}
		return null;
	}

	public static String bean2Json(Object bean) {
		if (bean == null) {
			return null;
		}
		try {
			return objectMapper.writeValueAsString(bean);
		} catch (Exception e) {
			logger.error("unconverted bean[" + bean + "]", e);
		}
		return null;
	}

	public static Map<?, ?> json2Map(String json) {
		if (json == null) {
			return null;
		}
		try {
			return objectMapper.readValue(json, Map.class);
		} catch (Exception e) {
			logger.error("unconverted json[" + json + "]", e);
		}
		return null;
	}

	public static List<?> json2List(String json) {
		if (json == null) {
			return null;
		}
		try {
			return objectMapper.readValue(json, List.class);
		} catch (Exception e) {
			logger.error("unconverted json[" + json + "]", e);
		}
		return null;
	}

	public static void main(String[] args) {
		String json = "{\"responseStatus\":{\"statusCode\":200,\"reasonPhrase\":\"请求成功完成\",\"family\":\"SUCCESSFUL\"},\"timestamp\":\"20140123091029\"}";
		Map result = JsonUtils.json2Map(json);
		int statusCode = Integer.parseInt(((Map) result.get("responseStatus")).get("statusCode").toString());
		System.out.println(statusCode);
	}
}
