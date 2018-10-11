package com.javaPractice.basicsAndMethods;

public class MethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loginToGmail("testMethods@gmail.com", "123456");
		int returnedResult = addTwoNumbers(562, 98, 6, "Addition of two numbers inside the method is:");
		System.out.println("Sum of two numbers inside main method is:" +returnedResult);
		
		
	}
	
//	public static void loginToGmail(String userName, String password) {
//		accessGmailPage();
//		gmail.enterUsername(userName);
//		gmail.enterPassword(password);
//		gmail.clickSignInButton();
//	}
	
	/**
	 * This method adds two numbers and stores it in a variable (integer) and prints the message
	 * 
	 * @exception - This throws arithmetic exception
	 * @deprecated
	 * @category - Arithmetic operation
	 * @param num1 - This is the number used for addition
	 * @param num2 - This is the number used for addition
	 * @param num3 - This will provide the number of times method is executed
	 * @param message - Message displayed at the end of the method
	 * @return - Returns the output of addition in the form of integer
	 * @author Sriharsha
	 */
	public static int addTwoNumbers(int num1, int num2, int num3, String message) {
		int result = num1 + num2;
		System.out.println(message + result);
		System.out.println("This method is executed "+num3+" number of times");
		return result;
	
	}

}
