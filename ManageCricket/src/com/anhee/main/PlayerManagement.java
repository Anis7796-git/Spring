package com.anhee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anhee.appconfig.AppConfig;
import com.anhee.sbean.PlayerService;

public class PlayerManagement {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		 PlayerService bean = ctx.getBean(PlayerService.class);
		 bean.displayPlayerInfo();
		 ctx.close();
		
	}

}
