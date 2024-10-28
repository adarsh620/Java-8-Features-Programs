package com.test.testingproject;
import java.util.function.Function;

public class FunctionsDemo {
	public static void main(String[] args) {
		// this is how we do this normaly
		FunctionsDemo fucntionsDemo = new FunctionsDemo();
		System.out.println(fucntionsDemo.squared(8));
		
		
		// this is how we do it using functions
		Function<Integer, Integer> fucntionDemo = i -> i * i; // Declaration and implementation of functions.
		//      input  , output type
		System.out.println("This square of the number is : " + fucntionDemo.apply(5)); // calling using "apply" method
	}
	
	public int squared(int i) {
		int result = i * i;
		return result;
	}
	

}
