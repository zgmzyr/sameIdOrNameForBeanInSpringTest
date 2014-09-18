package com.zyr.spring;

import javax.servlet.ServletContext;

import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author zhouguangming
 * 创建时间: 2014年9月17日 下午6:30:17
 */
public class SpringContextLoaderListener extends ContextLoaderListener {
	
	@Override
	protected void customizeContext(ServletContext servletContext, ConfigurableWebApplicationContext applicationContext) {
		super.customizeContext(servletContext, applicationContext);
		
		XmlWebApplicationContext context = (XmlWebApplicationContext) applicationContext;
		context.setAllowBeanDefinitionOverriding(false);
	}
}
