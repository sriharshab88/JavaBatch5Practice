package day3Programming;

public abstract class NonAccessModifiersPractcie {
	
	public static final int num2 = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		productOfTwoNumbers();
	}
	
	
	public static void productOfTwoNumbers() {
		
		int num1 = 244;
		
		int result;
		int updatedResult;
		
		result = num1*num2;
		updatedResult = result + 100;
		System.out.println(result +" --> "+ updatedResult);
	}
	
	public abstract void getRemainder();

}
