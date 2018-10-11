package com.javaPractice.oopsConcepts.Inheritance;

public class RunAmazonTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amazonTestCaseExecution();
}
	
	public static void amazonTestCaseExecution() {
		InheritingOfAmazonUseCases1 useCase1 = new InheritingOfAmazonUseCases1();
		useCase1.automationStatus();
		useCase1.launchBrowser();
		useCase1.loginToAmazon();
		useCase1.addItemToCart();
		useCase1.addDeliveryAddress();
		useCase1.addPaymentInfo();
		useCase1.orderSubmit();
		System.out.println("*********************************************************");
		
		InheritingOfAmazonUseCases2 useCase2 = new InheritingOfAmazonUseCases2();
		useCase2.automationStatus();
		useCase2.launchBrowser();
		useCase2.loginToAmazon();
		useCase2.addItemToCart();
		useCase2.addDeliveryAddress();
		useCase2.addPaymentInfo();
		useCase2.orderSubmit();
		System.out.println("*********************************************************");

		
		InheritingOfAmazonUseCases3 useCase3 = new InheritingOfAmazonUseCases3();
		useCase3.automationStatus();
		useCase3.launchBrowser();
		useCase3.loginToAmazon();
		useCase3.addItemToCart();
		useCase3.addDeliveryAddress();
		useCase3.addPaymentInfo();
		useCase3.orderSubmit();
		System.out.println("*********************************************************");

	}
	
	
	
	
	
	
	
	
}
