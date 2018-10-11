package day5Programming;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arrayExample();
		//findingMultipleOfFive();
		objectArrayExample();
	}
	
	public static void arrayExample() {
		//Type [] name of the variable = new type[size];
		//Type[] name of the variable = {value1, value2, value3, .... , value n};
		
		//String [] classStrength = new String [12];
		//classStrength[0] = "Harsha";
		//classStrength[1] = "Preetha";
		
		String [] classStrength = {"Harsha", "Preetha", "Theepa", "Thejaswini", "Parimala"};
		System.out.println(classStrength.length);
		System.out.println(classStrength[1]);
		}
	
	public static void findingMultipleOfFive() {
		
		
		int [] randomNumbers = {2, 4, 50, 45, 3, 110, 6, 390};
		int num2= 12;
		
		for (int i=0; i<randomNumbers.length;i++) {
			if(randomNumbers[i]%5==0) {
				System.out.println("Multiple of 5: "+randomNumbers[i]);
			}else {
				System.out.println("Non-Multiple of 5: "+randomNumbers[i]);
			}
		}
		
		
		
	}
		
	public static void objectArrayExample() {
	
		Object[] objectArray = new Object[4];
		objectArray[0] = "Java";  //string 
		objectArray[1] = 25;		// int
		objectArray[2] = 1.5;   //float
		objectArray[3] = false;  //boolean
		
		System.out.println(objectArray[3]);
	}
	
	
		
	}


