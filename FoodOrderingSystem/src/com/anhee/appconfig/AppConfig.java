package com.anhee.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.anhee")
@PropertySource("classpath:food.properties")
public class AppConfig {

}
