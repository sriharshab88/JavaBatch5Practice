package com.javaPractice.collections;

import java.util.Hashtable;

public class HashtablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		itemPriceMapping();
	}
	
	public static void itemPriceMapping() {
		Hashtable<String, Integer> itemMapping = new Hashtable<>();
		itemMapping.put("Iphone", 50000);
		itemMapping.put("DSLR camera", 35000);
		itemMapping.put("Dell Laptop", 45000);
		itemMapping.put("Dell Laptop", 45000);
		System.out.println(itemMapping);
		System.out.println(itemMapping.size());
		System.out.println(itemMapping.contains(35000));
		System.out.println(itemMapping.get("DSLR camera"));
		System.out.println(itemMapping.remove("Dell Laptop"));
		System.out.println(itemMapping);
		System.out.println(itemMapping.containsKey("Iphone"));
		System.out.println(itemMapping.containsValue(35000));
		System.out.println(itemMapping.remove("DSLR camera", 35000));
		System.out.println(itemMapping);
		System.out.println(itemMapping.size());
		
		
		
	}

}
