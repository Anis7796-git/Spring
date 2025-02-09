package com.anhee.sbean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class FoodService {
	
	
	@Autowired
	private FoodDetails foodDetails;
	
	public void displayFoodInfo() {
		
		System.out.println("Food Id :: "+foodDetails.getFoodId());
		System.out.println("FoodName :: "+foodDetails.getFoodName());
		System.out.println("PreparationTime :: "+foodDetails.getPreparationTime());
		System.out.println("RestaurantName ::"+foodDetails.getRestaurantName());
		
	}
	
	

}
