package com.test.testingproject;

public class InterfaceDemoImplementation3OverriddenExamle {
	
	// As we know default methods are dummy implementations ; so if we want we can overide them like this 
		public void printName() {
			System.out.println("This is overidden default method example");
		}
	
	public static void main(String[] args) {
		
		
		InterfaceDemoImplementation3OverriddenExamle demo3 = new InterfaceDemoImplementation3OverriddenExamle();
		demo3.printName();
		
		
	}


}

