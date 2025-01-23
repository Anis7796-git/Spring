package com.nt.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nit.sbean")
public class AppConfigSummer {

	
	public AppConfigSummer() {
		super();
	}


	
	
	@Bean(name="lDate")
	public LocalDate Date() {
		return LocalDate.now();
	}
	
	
	
}
