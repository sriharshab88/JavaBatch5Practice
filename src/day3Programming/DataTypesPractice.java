package day3Programming;

public class DataTypesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mathematicalOperations();
	}
	
	public static void mathematicalOperations() {
		int a=2,b=4;
		float c=4.5f,d=2.3f;
		double e=123.45,f=333.44;
		boolean flag = true;
		long milliSeconds = 1111221111111l;
		
		int sum = a+b;
		float product = c*d;
		double remainder = e%f;
		System.out.println("Result of above operations are: " + sum +","+product+","+remainder);
		System.out.println("the value of boolean variable: "+flag);
	}
	
	class defaultModifier{
		
		void accessThisMethod() {
			System.out.println("This is a sample method to explain default modifier");
		}
	}

}
