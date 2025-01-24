package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.appconfig.AppConfig;
import com.nit.sbean.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator bean = ctx.getBean("calculator",Calculator.class);
		System.out.println("Addition : "+bean.add(14, 16));
	System.out.println("subtract : "+bean.subtract(65, 17));
	System.out.println("multiply : "+bean.multiply(54, 5));
	System.out.println("divide  : "+bean.divide(764, 19));
	
		
	}

}
