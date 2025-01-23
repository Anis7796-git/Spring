package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbean.WishMessageGeneratorSeasson;
import com.nt.config.AppConfigSummer;

public class DependencyInjection {
	
	public static void main(String[] args) {
		System.out.println("DependencyInjection.main() Started");
		//IcoCtainer Getting the Object
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfigSummer.class);
		System.out.println("DependencyInjection ctx )");
		WishMessageGeneratorSeasson sesson= (WishMessageGeneratorSeasson) ctx.getBean("wmg");
		String seasson = sesson.generateSeasson("Heena");
		System.out.println(seasson);
		ctx.close();
	}

}
