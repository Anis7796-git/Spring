package com.anhee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anhee.appconfig.AppConfig;
import com.anhee.sbean.Address;
import com.anhee.sbean.Flight;
import com.anhee.sbean.User;

public class TajFlay {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flight flight = ctx.getBean(Flight.class);
		User user = ctx.getBean(User.class);
		Address address = ctx.getBean(Address.class);
		
		System.out.println(flight);
		System.out.println(user);
		System.out.println(address);
		
		ctx.close();
	
	}

}
