package day4Programming;

public class LoopControlPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//whileLoopExample();
		forLoopExample();
		//doWhileLoopExample();
	}
	
	public static void whileLoopExample() {
		
		int num1 = 1;
		
		while(num1<=10) {
			System.out.println("No. of iterations is: "+num1);
			num1++;
		}
		System.out.println("While loop ended");
	}
	
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
	
	public static void doWhileLoopExample() {
		int num2 = 20;
		do {
			System.out.println("Do while loop executes for "+num2+" times");
			num2++;
		}while(num2>30);
		System.out.println("Do while loop ended");
	}

}
