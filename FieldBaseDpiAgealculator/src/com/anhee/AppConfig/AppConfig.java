package com.anhee.AppConfig;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.anhee.sbean")
public class AppConfig {
	private LocalDate localdate=LocalDate.now();
	
	@Bean(name="brith")
	public int  age() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your brith year");
		int year= sc.nextInt();
		
		System.out.println("Enter your brith month");
		int month = sc.nextInt();
		
		System.out.println("Enter your brith date");
		int date = sc.nextInt();
		
		LocalDate birthdate=LocalDate.of(year, month, date);
		//localdate.compareTo(year-month-date);
		
		int age= Period.between(birthdate, localdate).getYears();
		
		return age;
	}
	
	
}
