package day3Programming;

import org.testng.annotations.Test;

public class OperatorsPractcie {
	
	static int num1 = 10;    
	static int num2 = 77;

	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
			arithmeticOperations();
			//relationOperations();
			//logicalOperations();
			assignmentOperations();
	}*/
	
	@Test
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
	
	@Test
	public static void relationOperations() {
		boolean comparisionResult =  (num1==num2);
		boolean notEqualToResult =  (num1!=num2);
		boolean greaterThanResult =  (num1>num2);
		boolean lesserThanResult =  (num1<num2);
		boolean greaterThanOrEqualToResult =  (num1>=num2);
		boolean lesserThanOrEqualToResult =  (num1<=num2);
		
		System.out.println(comparisionResult);
		System.out.println(notEqualToResult);
		System.out.println(greaterThanResult);
		System.out.println(lesserThanResult);
		System.out.println(greaterThanOrEqualToResult);
		System.out.println(lesserThanOrEqualToResult);
		
	}
	
	@Test
	public static void logicalOperations() {

		boolean logicalAndResult = (num1<num2) && (num1<num2); //true && true
		boolean logicalOrResult = (num1<num2) || (num1<num2);  //true || true
		boolean logicalNotResult = !(num1<num2);  //true --> false
		
		System.out.println(logicalAndResult);
		System.out.println(logicalOrResult);
		System.out.println(logicalNotResult);
		
		/*Logical AND									Logical OR
		 * true && true --> true							true || true --> true
		 * true && false --> false						true || false --> true
		 * false && true --> false						false || true --> true
		 * false && false --> false						false || false --> false
		 */
		
		/*
		 * !true --> false 
		 */
	}
	
	@Test
	public static void assignmentOperations() {
		
		System.out.println("**************************************************************");
		num1 = num2;   // num1 = 10; num2 = 77
		System.out.println(num1);
		num1 +=num2; // num1 = num1+num2;
		System.out.println(num1);
		num1 -=num2; // num1 = num1-num2;
		System.out.println(num1);
		num1 *=num2; // num1 = num1*num2;
		System.out.println(num1);
		num1/=num2; // num1 = num1/num2;
		System.out.println(num1);
		num1%=num2; // num1 = num1%num2;
		System.out.println(num1);
		
	}
}
