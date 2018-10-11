package com.javaPractice.basicsAndMethods;

public class ThisKeywordPractice {

	int num1;   //class variables
	int num2;
	
	public void assignTwoNumbers(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;	
	}
	
	public void displayTwoNumbers() {
		assignTwoNumbers(23,  44);
		System.out.println("Two numbers that are displayed are :" +num1 +","+num2);
	}
	
	public void callMethod() {
		this.assignTwoNumbers(23, 44);
		this.displayTwoNumbers();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThisKeywordPractice keyword = new ThisKeywordPractice();
			keyword.assignTwoNumbers(23, 44);
			keyword.displayTwoNumbers();
	}

}
