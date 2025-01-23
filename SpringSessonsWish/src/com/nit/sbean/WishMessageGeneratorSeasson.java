package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGeneratorSeasson {
	
		@Autowired
		private LocalDate currentDate;
		
		@Autowired
		public WishMessageGeneratorSeasson() {
			}
		
		
		public String generateSeasson(String user) {
			int month = currentDate.getMonthValue();
			if(month>3 && month<=6) {
			return user+"this is a  SpringSeasson season AutumnSeasson";
			}  else if(month>6 && month<=9){
				
				return user+"this is a  SummerSeasson season AutumnSeasson";
			}else if(month>9 && month<=11){
				
				return user+"this is a  AutumnSeasson season ";
			}else {
				return user+"this is a  Winter season ";
			}
		}
			
}
 
