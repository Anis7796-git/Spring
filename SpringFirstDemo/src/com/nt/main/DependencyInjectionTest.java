package com.nt.main;

import javax.swing.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	
	//create IOC container
public static void main(String[] args) {
	
	
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	//get Target Spring bean class obj ref
	
	WishMessageGenerator generator=(WishMessageGenerator) ctx.getBean("wmg");
	
	//invok business method
	String msg=generator.generateWishMessage("heena");
	//
	System.out.println(msg);
	ctx.close();
	
}
}