package com.anhee.helpper;

import org.springframework.stereotype.Component;


public interface IDiscountStrategy {
	double applyDiscount(double totalAmount); 

}
