package com.anhee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anhee.appconfig.AppConFig;
import com.anhee.helpper.IDiscountStrategy;
import com.anhee.sbeans.ConcreteDiscountFactory;
import com.anhee.sbeans.Customer;
import com.anhee.sbeans.Item;
import com.anhee.sbeans.ShoppingCart;

public class ShoppingSystem {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConFig.class);
		
		ConcreteDiscountFactory bean = ctx.getBean(ConcreteDiscountFactory.class);
		
		Customer customer= new Customer("Anhee","VIP");
		
		IDiscountStrategy discountStrategy = bean.getDiscountStrategy(customer.getType());
		
		ShoppingCart cart= new ShoppingCart();
		
		cart.addItem(new Item("Laptop", 50000));
		cart.addItem(new Item("Tv", 10000));
		cart.addItem(new Item("WashingMachine", 20000));
		cart.addItem(new Item("AC", 50000));
		
		cart.setDiscountStrategy(discountStrategy);
		double calculateTotal = cart.calculateTotal();
		double applyDiscount = cart.applyDiscount();
		System.out.println(calculateTotal);
		System.out.println(applyDiscount);
		cart.displayItems();
		
		ctx.close();	
	}

}
