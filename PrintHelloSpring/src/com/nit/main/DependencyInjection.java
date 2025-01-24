package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.nit.appconfig.AppConfig;
import com.nit.sbeans.Wish;


public class DependencyInjection {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Wish wish = ctx.getBean("wmg",Wish.class);
		
		wish.message();
		
		
		}
	}
