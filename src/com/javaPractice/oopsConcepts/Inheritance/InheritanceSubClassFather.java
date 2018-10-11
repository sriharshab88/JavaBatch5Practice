package com.javaPractice.oopsConcepts.Inheritance;
import day3Programming.OperatorsPractcie;

public class InheritanceSubClassFather extends InheritanceSuperClassGFather{


	public static void forLoopExample() {
		
		for (int i=21; i<=25; i++) {
			System.out.println("For loop is executed "+i+" times");
		}
		System.out.println("*******************************************************");
		for (int j=25; j>=15;j--) {
			System.out.println("For loop is executed "+j+" times in a reverese manner");
			if(j==6*3) {
				System.out.println("The loop ends here");
				break;
			}
		}
	}

	public static void usageOfInheritedMethods() {
		System.out.println("******************************************************");
		arithmeticOperations();
		System.out.println("******************************************************");
		mathematicalOperations();
		System.out.println("******************************************************");
		forLoopExample();
		System.out.println("******************************************************");
		simpleCalculator(23, 890, "+");
		System.out.println("******************************************************");
	}

	
}
