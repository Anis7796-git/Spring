package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	public String city;
	public String state;
	public Address() {
		
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public void displayStudentDetails() {
		System.out.println("City : " + city + "\n" + "State : " + state);
	}
}
