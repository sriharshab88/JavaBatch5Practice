package day5Programming;

import org.testng.annotations.Test;

public class StringPractice {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringExample();
		fetchNamesFromEmailIDs();
	}*/
	
	@Test
	public static void stringExample() {
		String example = "This is a java & Selenium session for Strings for batch 5";
		String example2 = "Selenium";
		
		System.out.println(example.concat(" for Batch 5")); 
		System.out.println(example.length());
		System.out.println(example.substring(10,14));
		System.out.println(example.substring(10));
		System.out.println(example.indexOf("session"));
		System.out.println(example.charAt(15));
		System.out.println(example.contains("for Strings"));
		System.out.println(example.equals("This is a JAVA session for Strings"));
		System.out.println(example.equalsIgnoreCase("This is a JAVA session for Strings"));
		System.out.println(example.compareTo("This is a java session for Strings"));
		System.out.println(example.endsWith("This"));
		int hashcode1 = example.hashCode();
		System.out.println(hashcode1);
		System.out.println(example2.isEmpty());
		System.out.println(example.lastIndexOf("for"));
		System.out.println(example.replace("java", "Selenium"));
		System.out.println(example.replaceAll("for", "FOR"));
		System.out.println(example.toUpperCase());
		System.out.println(example.toLowerCase());
		System.out.println(example.trim());
		String [] splittedVariable = example.split("&");
		System.out.println(splittedVariable[0]);
		System.out.println(splittedVariable[1]);
				
	}
	
	@Test
	public static void fetchNamesFromEmailIDs() {
		String [] emailID = {"harsha.88@gmail.com", "preetha.123@gmail.com", "Parimala@yahoo.com",
			"Theepa@gmail.com"};
		
		for (int i=0; i<emailID.length; i++) {
		String [] name = emailID[i].split("@");
		System.out.println("Name contained in the email is using Spilit method: "+ name[0]);
		
		int index = emailID[i].indexOf("@");
		String name1 = emailID[i].substring(0, index);
		System.out.println("Name contained in the email is using Substring method: "+name1);
		
		
		
		}
	
		
	}
	
	

}
