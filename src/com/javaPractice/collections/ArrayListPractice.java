package com.javaPractice.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		availablePaymentMethods();
	}
	
	public static void availablePaymentMethods() {
		//String banking = "HDFC Net banking";
		//System.out.println(banking.contains("HDFC"));
		List<String> paymentMethods = new ArrayList<>();
		System.out.println(paymentMethods);
		paymentMethods.add("NetBanking");
		paymentMethods.add("Wallets");
		paymentMethods.add("Credit cards");
		
		List<String> paymentMethods1 = new ArrayList<>();
		System.out.println(paymentMethods1);
		paymentMethods1.add("NetBanking");
		paymentMethods1.add("Wallets");
		paymentMethods1.add("Credit cards");
		
		List<String> bankList = new ArrayList<>();
		bankList.add("Axis bank");
		bankList.add("HDFC bank");
		bankList.add("ICICI bank");
		bankList.add("ICICI bank");
		
		System.out.println(paymentMethods);
		System.out.println(paymentMethods.size());
		System.out.println(paymentMethods.isEmpty());
		System.out.println(paymentMethods.get(2));
		System.out.println(paymentMethods.contains("NetBanking"));
		System.out.println(paymentMethods.addAll(bankList));
		System.out.println(paymentMethods);
		System.out.println(paymentMethods.containsAll(bankList));
		System.out.println(paymentMethods.equals(paymentMethods1));
		paymentMethods.add(5, "SBI");
		System.out.println(paymentMethods);
		System.out.println(paymentMethods.remove("ICICI bank"));
		System.out.println(paymentMethods);
		System.out.println(paymentMethods.remove(3));
		System.out.println(paymentMethods);
		
		for (String paymentName : paymentMethods) {
			System.out.println(paymentName);
		}
		
		paymentMethods.clear();
		System.out.println(paymentMethods);
	}

}
