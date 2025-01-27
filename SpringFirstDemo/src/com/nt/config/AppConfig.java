package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	
	
	}
	
	@Bean(name="ltime")
	public LocalTime createLTime() {
		System.out.println("AppConfig.createLTime()");
		
		return LocalTime.now();
	}
	@Bean(name="lDate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()"+LocalDate.now());
		
		return LocalDate.now();
	}

}
