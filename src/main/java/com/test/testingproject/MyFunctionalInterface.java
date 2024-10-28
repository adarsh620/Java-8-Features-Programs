package com.test.testingproject;


@FunctionalInterface
interface MyFunctionalInterface {
	
	// Single abstract method
    void greet(String name);
    
    // You can also add default or static methods (optional)
    default void sayHello() {
        System.out.println("Hello!");
    }
}