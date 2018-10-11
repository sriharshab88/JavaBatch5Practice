package com.javaPractice.oopsConcepts.Inheritance;

public class InheritanceSuperClassGFather {

	public static int num1 = 10;    
	public static int num2 = 77;

	
	public static void arithmeticOperations() {
		int sum = num1+num2;
		System.out.println("Sum value: "+sum);
		int difference = num1-num2;
		int product = num1*num2;
		System.out.println("Product value: "+product);
		int quotient = num1/num2;
		int remainder = num1%num2;
		sum ++;   //sum = sum+1;
		product--;  //product = product-1;
		
		System.out.println(difference+", "+quotient+", "+remainder);
		//System.out.println("incremental value: "+sum);
		//System.out.println("decremental Value: "+product);
				
	}
	
	
	public static void mathematicalOperations() {
		int a=2,b=4;
		float c=4.5f,d=2.3f;
		double e=123.45,f=333.44;
		boolean flag = true;
		long milliSeconds = 1111221111111l;
		
		int sum = a+b;
		float product = c*d;
		double remainder = e%f;
		System.out.println("Result of above operations are: " + sum +","+product+","+remainder);
		System.out.println("the value of boolean variable: "+flag);
	}
	
	public static Object simpleCalculator(int num1, int num2, String operation) {
		Object result =0;
		String operationName = null;
		
		switch (operation) {
		case "+":
			operationName = "Addition";
			result = num1+num2;
			break;
			
		case "-":
			operationName = "Subtraction";
			result = num1-num2;
			break;
			
		case "*":
			operationName = "Product";
			result = num1*num2;
			break;
			
		case "/":
			operationName = "Division";
			result = num1/num2;
			break;
			
		case "%":
			operationName = "Modulus";
			result = num1%num2;
			break;
			
		case ">":
			operationName = "Greater Than";
			result = num1>num2;
			break;
			
		case "<":
			operationName = "Less Than";
			result = num1<num2;
			break;
			
		default:
			operationName = "invalid";
			System.out.println("This is an invalid operation !!!!");
			break;	
		}
		System.out.println("The result of the "+operationName+" operaton is: "+result);
		if(operationName!="invalid") {
		System.out.println("Successfully executed the operation !!!");
		}
		return result;
		
	}

}
