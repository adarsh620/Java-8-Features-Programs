package com.test.testingproject;

public class InterfaceDemoImplementation2 implements InterfaceDemo {
	
	
	// As we know default methods are dummy implementations ; so if we want we can oveeride them like this 
//	public void printName() {
//		System.out.println("This is overidden default method example");
//	}
	
	public static void main(String[] args) {
		
		// this is we can use default method in our implementing class
		InterfaceDemoImplementation2 demo2 = new InterfaceDemoImplementation2();
		demo2.printName();
		
		
	}


}

