package com.javaPractice.constructors;

public class ConstructorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usingConstructorExample();
	}

	public static void usingConstructorExample() {
		SampleClassWithConstructors sampleClass = new SampleClassWithConstructors();
		sampleClass.simpleMethod("Java Practice Day 12");
		System.out.println("************************************************************");
		SampleClassWithConstructors sampleClass1 = new SampleClassWithConstructors("JAVA", 12);
		sampleClass1.simpleMethod("Selenium Training");
		System.out.println("************************************************************");
		SampleClassWithConstructors sampleClass2 = new SampleClassWithConstructors("JAVA", "Selenium");
		sampleClass2.simpleMethod("JAVA Training");
		
	}
}
