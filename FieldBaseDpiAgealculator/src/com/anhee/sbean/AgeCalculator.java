package com.anhee.sbean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("age")
public class AgeCalculator {
	
	
	
	@Autowired
	public int pp;
	
	public void age() {
		System.out.println("Your Age is "+pp);
	}
	
	

}
