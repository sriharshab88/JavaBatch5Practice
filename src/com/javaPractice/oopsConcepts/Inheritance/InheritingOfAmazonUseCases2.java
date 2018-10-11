package com.javaPractice.oopsConcepts.Inheritance;

import com.javaPractice.oopsConcepts.PlaceItemInAmazaon;

public class InheritingOfAmazonUseCases2 extends PlaceItemInAmazaon{

	@Override
	public void automationStatus() {
		System.out.println("Automation using Selenium is started");
	}
	
	
	@Override
	public void launchBrowser() {
		System.out.println("Chrome browser launched successfully");
		
	}

	@Override
	public void loginToAmazon() {
		System.out.println("Loggedin to Amazon with Hotmail credentials successfully");
		
	}

	@Override
	public void addItemToCart() {
		System.out.println("Added Clothing item to cart");
		
	}

	@Override
	public void addPaymentInfo() {
		System.out.println("Added Netbanking payment information");
		
	}

	@Override
	public void orderSubmit() {
		System.out.println("Submitted the order successfully");
		
	}

	@Override
	public void addDeliveryAddress() {
		System.out.println("Added Bangalore Address to my profile");
		
	}
	
	
	
}
