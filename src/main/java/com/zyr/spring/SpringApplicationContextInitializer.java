package com.zyr.spring;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author zhouguangming
 * 创建时间: 2014年9月17日 下午7:36:36
 */
public class SpringApplicationContextInitializer implements ApplicationContextInitializer<XmlWebApplicationContext> {

	public void initialize(XmlWebApplicationContext applicationContext) {
		applicationContext.setAllowBeanDefinitionOverriding(false);
	}
}
