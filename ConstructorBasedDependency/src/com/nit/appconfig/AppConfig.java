package com.nit.appconfig;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class AppConfig {
	private LocalDate localDate;
	
	
	@Bean(name="ldate")
	public LocalDate localDate() {
		return LocalDate.now();
	}

}
