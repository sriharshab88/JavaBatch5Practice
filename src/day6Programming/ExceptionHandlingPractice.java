package day6Programming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionHandlingPractice {

	/*public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//newExceptionThrown();
		tryCatchExceptionExample();
	}*/
	
	@Test
	public static void accessNewFile() throws FileNotFoundException, IOException { //throws keyword
		File file = new File("D:/Selenium/Practice.html");
		FileReader reader = new FileReader(file);
	}
	@Test
	public static void newExceptionThrown() throws Exception {
		String var1 = "This is a Null Pointer Exception";
		String var2 = "This is a Array Index out of Bound Exception";
		String message = "This is my own created exception, and it is displayed whenever i need";
		
		if(var1.contains("Exception") || var2.contains("Exception")) {
			throw new Exception(message);
		}
	}
	@Test
	public static void tryCatchExceptionExample(){

		String selectedProduct = "Camera";
		String [] prices = {"29999", "39999", "49999"};
		try {
		if(selectedProduct.contains("Camera")) {
			System.out.println("Price of this is "+prices[2]+"");
			System.out.println("This is PASS");
		}else if(selectedProduct.contains("NIKON")) {
			System.out.println("Price of this is "+prices[1]+"");
			throw new Exception("This is not a valid item present in the list");
		}else if(selectedProduct.contains("Samsung")){
			System.out.println("Price of this is "+prices[0]+"");
			System.out.println("This is PASS");
		}else {
			throw new Exception("This is not a valid item present in the list");
		}
		}catch (Exception e) {
			System.out.println("This is not a valid item present in the list");
			System.out.println("This is FAIL");
		}
		finally {
			System.out.println("FINALLY --> This item is always available");
		}
	
				
			
		}
		
	}

