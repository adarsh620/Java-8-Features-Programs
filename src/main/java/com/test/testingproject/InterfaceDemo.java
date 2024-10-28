package com.test.testingproject;

public interface InterfaceDemo {
	
	
	// this abstract method printNameABS(); will give compile time error to the classes implementing this interface (InterfaceDemoImplementation1 and InterfaceDemoImplementation2)
	//void printNameABS();
	
	
	// to resolve this error we use "default" methods
 	default void printName() {
 		System.out.println("This is default method example");
 	}

}
