package com.anhee.sbeans;

import org.springframework.stereotype.Component;

import com.anhee.helpper.IDiscountStrategy;


public class Customer {
	private String name;
	private String type;
	
	
	
	public Customer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
	

}
