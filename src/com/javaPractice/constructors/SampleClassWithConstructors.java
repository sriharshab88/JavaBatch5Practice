package com.javaPractice.constructors;

public class SampleClassWithConstructors {

	public SampleClassWithConstructors() {
		System.out.println("This is a simple constructor without any arguments");	
	}

	public SampleClassWithConstructors(String name, String message) {
		System.out.println("This is a simple constructor with arguments");
		System.out.println(name + message);
	}
	
	public SampleClassWithConstructors(String name, int number) {
		System.out.println("This is a simple constructor with arguments");
		System.out.println(name + number);
	}
	
	public void simpleMethod(String message) {
		System.out.println("This is a simple method with argument :"+ message);
	}

}
