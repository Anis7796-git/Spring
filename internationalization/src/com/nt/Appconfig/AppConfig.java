package com.nt.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource creatRBMS() {
		ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com/nt/common/App");
		return rbms;
	}
	
}
