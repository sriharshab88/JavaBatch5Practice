package com.javaPractice.oopsConcepts.Enacpsulation;

public class DisplayItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayItems();
	}
	
	public static void displayItems() {
		
		ItemsList list = new ItemsList();
		
		String item1 = list.getLEDTelevision();
		System.out.println(item1);
		list.setTvPrice(50000);
		System.out.println("*******************************************");
		
		String item2 = list.getSamsungMobile();
		System.out.println(item2);
		list.setMobilePrice(25000);
		System.out.println("*******************************************");
		
		String item3 = list.getVegetables();
		System.out.println(item3);
		list.setVegetablePrice(500);
		System.out.println("*******************************************");
		
		
	}

}
