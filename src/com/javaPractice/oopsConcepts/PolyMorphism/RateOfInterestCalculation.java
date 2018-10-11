package com.javaPractice.oopsConcepts.PolyMorphism;

public class RateOfInterestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banks bank;
		bank = new AxisBank();
		bank.getRateOfInterest();
		System.out.println("***************************************");
		
		bank = new HDFCBank();
		bank.getRateOfInterest();
		System.out.println("***************************************");
		
		bank = new ICICIBank();
		bank.getRateOfInterest();
		System.out.println("***************************************");
	}

}
