package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("wmg")
public class Wish {

	
	public Wish() {
		super();
	}

	public void message() {
		System.out.println("Hello, Spring Core!");
	}

}
