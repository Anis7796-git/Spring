package com.anhee.sbeans;

import org.springframework.stereotype.Component;

import com.anhee.helpper.IDiscountStrategy;
@Component("nd")
public class NoDiscount implements IDiscountStrategy {

	@Override
	public double applyDiscount(double totalAmount) {
		
		return totalAmount;
	}

}
