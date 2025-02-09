package com.anhee.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@Configuration
@PropertySource("classpath:flightBooking.properties")
@ComponentScan(basePackages = "com.anhee.sbean")
public class AppConfig {

}
