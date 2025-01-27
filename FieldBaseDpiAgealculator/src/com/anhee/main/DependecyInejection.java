package com.anhee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anhee.AppConfig.AppConfig;
import com.anhee.sbean.AgeCalculator;

public class DependecyInejection {
	
public static void main(String[] args) {
	

	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	AgeCalculator bean = ctx.getBean("age",AgeCalculator.class);
	bean.age();
	ctx.close();
	
	}	


}
