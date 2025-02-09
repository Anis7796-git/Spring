package com.anhee.sbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.anhee.helpper.IDiscountFactory;
import com.anhee.helpper.IDiscountStrategy;

@Configuration
@Component
public class ConcreteDiscountFactory implements IDiscountFactory{

	@Autowired
	private PremiumDiscount premiumDiscount;
	@Autowired
	private VIPDiscount vipDiscount;
	
	@Autowired
	private NoDiscount noDiscountl;
	
	
	
	
	
	public IDiscountStrategy getDiscountStrategy(String customerType) {
		if(customerType.equalsIgnoreCase("vip")) {
			return vipDiscount;
		}else if(customerType.equalsIgnoreCase("premium")) {
			return  premiumDiscount;
		}else {
		return noDiscountl ;
		
		}
		
		
	}


	
	
}
