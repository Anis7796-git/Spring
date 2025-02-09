package com.anhee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anhee.appconfig.AppConfig;
import com.anhee.sbean.FoodService;

public class FoodOrderingApp {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	
	
	FoodService bean = ctx.getBean(FoodService.class);
	
	bean.displayFoodInfo();
	ctx.close();
	}
	

}
