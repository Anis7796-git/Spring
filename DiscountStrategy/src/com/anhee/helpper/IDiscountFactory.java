package com.anhee.helpper;

import org.springframework.stereotype.Component;


public interface IDiscountFactory {
	IDiscountStrategy getDiscountStrategy(String customerType);
}
