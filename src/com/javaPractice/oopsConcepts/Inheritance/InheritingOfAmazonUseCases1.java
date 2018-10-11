package com.javaPractice.oopsConcepts.Inheritance;

import com.javaPractice.oopsConcepts.PlaceItemInAmazaon;

public class InheritingOfAmazonUseCases1 extends PlaceItemInAmazaon{


	@Override
	public void launchBrowser() {
		System.out.println("Firefox browser launched successfully");
		
	}

	@Override
	public void loginToAmazon() {
		System.out.println("Loggedin to Amazon with Gmail credentials successfully");
		
	}
	

	@Override
	public void addItemToCart() {
		System.out.println("Added Electronic item to cart");
		
	}

	@Override
	public void addPaymentInfo() {
		System.out.println("Added Credit card payment information");
		
	}

	@Override
	public void orderSubmit() {
		System.out.println("Submitted the order successfully");
		
	}

	@Override
	public void addDeliveryAddress() {
		System.out.println("Added United states of America Address to my profile");
		
	}

}
