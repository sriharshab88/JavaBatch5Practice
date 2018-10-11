package day4Programming;

public class DecisionMakingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifConditionExample();
		//identifyEvenAndOddNumbers();
		//ifElseConditionExample();
		//nestedIfStatementExample();
		//nestedIfStatementExample2();
		elseIfConditionExample();
	}
	
	public static void ifConditionExample() {
		
		int num1=22;
		if(num1>25) {
			System.out.println("The if condition executed");
		}
		System.out.println("If condition ended");
	}
	
	public static void identifyEvenAndOddNumbers() {  //Print odd and even numbers b/w 1 to 20
		
		for (int i=1; i<=20;i++) {
			int remainder = i%2;
			System.out.println("Now the number is "+i+"");
			if(remainder==0) {
				System.out.println("This is an even Number :"+i);
			}else {
				System.out.println("This is an odd Number :"+i);
			}
			System.out.println("******************************************************");
 		}
	}
	
	public static void ifElseConditionExample() {
		int num2 = 25;
		if(num2!=25) {
			System.out.println("Number printed here in if part is :"+ num2);
		}else {
			System.out.println("Number printed here in else part is :"+ num2);
		}
		
	}
	
	public static void nestedIfStatementExample() {
		int num4=25;
		int num5=30;
		if(num4==25) {
			System.out.println("It is inside first if statement");
			if(num4+5==num5) {
				System.out.println("It is inside second if statement");
				if(num4+num5<100) {
					System.out.println("This is how nested if executes");
				}
			}
		}
	}
	
	public static void nestedIfStatementExample2() {
		int num2=21;
		int num3=25;
		
		if(num2%2==0 || num3%2==0) {
			System.out.println("One of them is even number");
		}else {
			System.out.println("Both are odd numbers");
		}
	}
	
	public static void elseIfConditionExample() {
		int num2=23;
		int num3=100;
		if(num2%5==0 || num2%5==5) {
			System.out.println("This is a multiple of 5 :" +num2);
		}else if(num3%5==0 || num3%5==5) {
			System.out.println("This is a multiple of 5 :" +num3);
		}else {
			System.out.println("the numbers are not multiple of 5");
		}
		
	}

}
