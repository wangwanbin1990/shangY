package com.sy.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextHolder implements ApplicationContextAware {

	public static ApplicationContext context;

	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		SpringContextHolder.context = context;
	}
}