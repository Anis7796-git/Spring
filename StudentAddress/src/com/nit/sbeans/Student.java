package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	public String name;
	public Integer rollNumber;
	public Address address;

	@Autowired
	public Student(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayStudentDetails() {
		System.out.println("Name : " + name + "\n" + "RollNumber : " + rollNumber);
		address.displayStudentDetails();
	}

}
