package com.anhee.sbeans;

import java.util.ArrayList;
import java.util.List;

import com.anhee.helpper.IDiscountStrategy;

public class ShoppingCart {
	private IDiscountStrategy discountStrategy;
	
	List<Item> items= new ArrayList<Item>();
	public void addItem(Item item) {
		items.add(item);
	}
	public double calculateTotal() {
		return items.stream().mapToDouble(Item::getPrice).sum();
		
	}
	 public double applyDiscount() {
		
		return discountStrategy.applyDiscount(calculateTotal());
	}
	
	
	 public	void setDiscountStrategy(IDiscountStrategy discountStrategy) {
		this.discountStrategy=discountStrategy;
	}
	
	
	 public	void displayItems() {
		 items.forEach(item -> System.out.println(item.getName() + ": " + item.getPrice()));
	}

}
