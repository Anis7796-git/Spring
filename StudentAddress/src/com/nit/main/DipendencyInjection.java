package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Appconfig.AppConfig;
import com.nit.sbeans.Address;
import com.nit.sbeans.Student;

public class DipendencyInjection {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Address ad= ctx.getBean("address",Address.class);
		
		
		
		Student std = new Student(ad);
		
	System.out.println("Enter the Student Name");
	std.setName(sc.nextLine());
	System.out.println("Enter the Student Roll Number");
		std.setRollNumber(sc.nextInt());
		
		System.out.println("Enter the City Name ");
		ad.city=sc.next();
		
		System.out.println("Enter the State Name ");
		 ad.state=sc.next();
		
	
		
		
		std.displayStudentDetails();
		
		sc.close();

	}

}
