package day3Programming;

public class ModifiersPractice {

	private static String modules = "Automatic";
	private static int wheelsDrive = 4;
	private boolean isManualDriveAvailable = true;
	public static String registration = "Karnataka";
	public static int regNumber = 5192;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		purchasingCar();
		sellingCar();
	}
	
	private static void purchasingCar() {
		int price = 5000;
		String model = "Swift";
		boolean soldStatus = false;
		System.out.println("**************************************************************");
		System.out.println("Print "+price+", "+model+" with sold status is "+soldStatus+"");
	}
	
	public static void sellingCar() {
		int price = 10000;
		String model = "Honda City";
		boolean status = true;
		System.out.println("**************************************************************");
		System.out.println("Print "+price+", "+model+" with sold status is "+status+"");
		System.out.println(modules);
		System.out.println(wheelsDrive);
	}
	
	protected void sellersInformations() {
		System.out.println("This contains sellers information");
	}
	
	

}
