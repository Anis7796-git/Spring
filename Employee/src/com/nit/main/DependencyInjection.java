package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Appconfig.Appconfig;
import com.nit.sbean.EmployeeDetails;
import com.nit.sbean.EmployeeService;



public class DependencyInjection {
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		
				EmployeeDetails  emp=ctx.getBean(EmployeeDetails.class);
				emp.setDepartment("computer");
				emp.setEmployeId("NIT11");
				emp.setName("Amit");
				emp.setSalary(109999.0);
				EmployeeService es=new EmployeeService(emp);
				es.m1();
				
				
	}
	
	
	

}
