package day3Programming;

public class ReferenceDataTypePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			placeOrder();
	}
	
	
	
	public static void placeOrder() {
		String product = "Samsung";
		int price = 12000;
		String model = "LED TV";
		
		System.out.println("Television Bought of brand "+product+" and price is "+price+""
								+ " of model "+model+"");
		
		DataTypesPractice dataTypes = new DataTypesPractice();
		dataTypes.mathematicalOperations();
		
		ModifiersPractice modifiersPractice = new ModifiersPractice();
		modifiersPractice.sellingCar();
		System.out.println(modifiersPractice.registration);
		System.out.println(modifiersPractice.regNumber);
		modifiersPractice.sellersInformations();
		
	}

}
