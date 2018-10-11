package com.javaPractice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setExample();
		identifyUniqueCharacters();
	}
	
	public static void setExample() {
		
		Set<String> uniqueItemsInStock = new HashSet<>();
		uniqueItemsInStock.add("MobilePhones");
		uniqueItemsInStock.add("Power Banks");
		uniqueItemsInStock.add("Chargers");
		uniqueItemsInStock.add("Bluetooth Speakers");
		uniqueItemsInStock.add("Chargers");
		
		
		System.out.println(uniqueItemsInStock);
	}
	
	public static void identifyUniqueCharacters() {
		String input = "ICICI"; //Selnium
		Set<Character> uniqueCharacters = new HashSet<>();
		char[] eachCharacter = input.toCharArray();
		for (int i=0;i<eachCharacter.length;i++) {
			for (int j=1; j<eachCharacter.length;j++) {
				if(eachCharacter[i]!=eachCharacter[j]) {
				System.out.println("This is not an unique element");
				uniqueCharacters.add(eachCharacter[i]);
				}
			}
		}
		System.out.println(uniqueCharacters);
		
	}

}
