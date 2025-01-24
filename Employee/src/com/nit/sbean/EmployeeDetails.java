package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("com")
public class EmployeeDetails {
	
	String name;
	
	String department;
	
	String employeId;
	
	double salary;
	
	
	public EmployeeDetails() {
		super();
	}
	
	public EmployeeDetails(String name, String department, String employeId, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.employeId = employeId;
		this.salary = salary;
	}
	
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getEmployeId() {
		return employeId;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public String toString() {
		return "EmployeeDetails [name=" + name + ", department=" + department + ", employeId=" + employeId + ", salary="
				+ salary + "]";
	}
	
	
	
	

}
