package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("calculator")
public class Calculator {

	
	
		public Calculator() {
		super();
	}

		public	double add(double a, double b) {
			return a+b;
		}
		
		public	double subtract(double a, double b) {
			return a-b;
		}
		
		public	double multiply(double a, double b) {
			return a*b;
		}
		
		public	double divide(double a, double b) {
			return a/b;
		}
}
