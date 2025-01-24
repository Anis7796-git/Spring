package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	public int id;
	public String name;
	public LocalDate localdate;
	
	@Autowired
	public Employee(LocalDate localdate) {
		super();
		this.localdate = localdate;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", localdate=" + localdate + "]";
	}


	

	
	
}

