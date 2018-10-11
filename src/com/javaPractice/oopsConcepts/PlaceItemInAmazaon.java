package com.javaPractice.oopsConcepts;

public abstract class PlaceItemInAmazaon {

	public void automationStatus() {
		System.out.println("Automation has started");
	}

	public abstract void launchBrowser();
	public abstract void loginToAmazon();
	public abstract void addItemToCart();
	public abstract void addDeliveryAddress();
	public abstract void addPaymentInfo();
	public abstract void orderSubmit();
	
}
