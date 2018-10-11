package day4Programming;

import org.testng.annotations.Test;

public class SwitchStatementExample {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		simpleCalculator(8341, 223, ">");
	}*/
	
	@Test
	public static void calculator() {
		simpleCalculator(8341, 223, ">");
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
	
	//i+=2 ---> i = i+2

}
