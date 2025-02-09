package com.anhee.sbeans;

import org.springframework.stereotype.Component;

import com.anhee.helpper.IDiscountStrategy;
@Component("pm")
public class PremiumDiscount implements IDiscountStrategy {

	@Override
	public double applyDiscount(double totalAmount) {
		
		return (totalAmount-=(totalAmount*0.1));
	}

}
