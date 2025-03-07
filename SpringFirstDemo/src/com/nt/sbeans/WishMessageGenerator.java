package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalTime lt;
	@Autowired
	private LocalDate ld;
	
	
	@Autowired
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}

	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}


	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()"+lt+""+ld);
		
		int hour=lt.getHour();
		
		if(hour<12) {
			return "GoodMorning"+user;
		}else if(hour<16) {
			return "GoodAfterNoon"+user;
		}else if(hour<20) {
			return"GoodEvening"+user;
		}else
		return "Good Night"+user;
	}

}
