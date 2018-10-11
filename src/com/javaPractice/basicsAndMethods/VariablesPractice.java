package com.javaPractice.basicsAndMethods;

public class VariablesPractice {
	
	public static String message = "This is the new operations message";
	public static int newResult;
	public static int num1 = 1001;
	public static int num2 = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basicOperations();
		newOperations();
	}
	
	public static void basicOperations() {
	
		int result, difference, product, quotient;
		
		result = num1+num2;
		difference = num2-num1;
		product = num1*num2;
		quotient = num2/num1;
		System.out.println("Sum of 2 numbers provided:" +result);
		System.out.println("Difference of 2 numbers provided:" +difference);
		System.out.println("Product of 2 numbers provided:" +product);
		System.out.println("Division of 2 numbers provided:" +quotient);
		System.out.println("*********************************************");
	}
	
	public static void newOperations() {
		String sum = message;
		newResult = (num2+num1)*10;
		System.out.println("New operation of 2 numbers provided:" +newResult);
		System.out.println("The message printed here is: "+sum);
	}
	
	

}
