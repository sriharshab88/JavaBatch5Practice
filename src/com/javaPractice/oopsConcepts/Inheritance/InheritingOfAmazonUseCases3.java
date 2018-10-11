package com.javaPractice.oopsConcepts.Inheritance;

import com.javaPractice.oopsConcepts.PlaceItemInAmazaon;

public class InheritingOfAmazonUseCases3 extends PlaceItemInAmazaon{

	@Override
	public void launchBrowser() {
		System.out.println("Microsoft Edge browser launched successfully");
		
	}

	@Override
	public void loginToAmazon() {
		System.out.println("Loggedin to Amazon with Microsoft credentials successfully");
		
	}

	@Override
	public void addItemToCart() {
		System.out.println("Added Footwear item to cart");
		
	}

	@Override
	public void addPaymentInfo() {
		System.out.println("Added Wallet payment information");
		
	}

	@Override
	public void orderSubmit() {
		System.out.println("Submitted the order successfully");
		
	}
	
	@Override
	public void addDeliveryAddress() {
		System.out.println("Added Mysore Address to my profile");
		
	}
}
