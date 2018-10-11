package com.javaPractice.collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iteratorExample();
	}

	public static void iteratorExample() {
		
		ArrayList<String> listOfEcommerceSites = new ArrayList<>();
		listOfEcommerceSites.add("Flipkart");
		listOfEcommerceSites.add("Amazon");
		listOfEcommerceSites.add("Snapdeal");
		listOfEcommerceSites.add("Shopclues");
		listOfEcommerceSites.add("Ali baba");
		
		System.out.println(listOfEcommerceSites);
		
		Iterator<String> eachSite = listOfEcommerceSites.iterator();
		while (eachSite.hasNext()) {
			String nextValue = eachSite.next();
			System.out.println(nextValue);
			if(nextValue.equalsIgnoreCase("Shopclues")) {
				eachSite.remove();
			}
			
		}
		System.out.println(listOfEcommerceSites);
	}
}
