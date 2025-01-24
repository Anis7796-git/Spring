package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	public EmployeeDetails empd;

	@Autowired
	public	EmployeeService(EmployeeDetails emp) {
		this.empd = emp;

	}

	public void m1() {
		System.out.println(empd);
	}
}
