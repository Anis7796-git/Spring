package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig;

public class internationalization {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter you langauge ");
		String langague = sc.next();
		
		System.out.println("Enter you Country");
		String country = sc.next();
		
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	
		Locale locale= Locale.of(langague, country);
		String message = ctx.getMessage("Wish.msg",new Object[] {"Shubham"}, locale);
		String message2 = ctx.getMessage("missing.msg",new Object[] {"shubham : "}, locale);
		String message3 = ctx.getMessage("check.msg",new Object[] {"shubham : "}, locale);
		String message4 = ctx.getMessage("break.msg",new Object[] {"chandrmukhi : "}, locale);
		
		System.out.println(message+"\n"+message2+"\n"+message3+"\n"+message4);
		ctx.close();
		sc.close();
		
	}

}
