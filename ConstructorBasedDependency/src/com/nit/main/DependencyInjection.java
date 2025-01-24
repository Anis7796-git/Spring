package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.appconfig.AppConfig;
import com.nit.sbean.Employee;

public class DependencyInjection {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		Employee bean = ctx.getBean("employee",Employee.class);
		bean.setId(123);
		bean.setName("shubham");
		
		System.out.println(bean);
	}

}
