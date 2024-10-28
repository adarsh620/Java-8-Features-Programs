package com.test.CodingQuestions;

import java.util.function.BiFunction;

public class MultiplyDemo {
	public static void main(String[] args) {
	//	Questions was  :- Write a program to multiply 2 no's using Functional Interface
		// by creating out own FI.
	//	using that functional interface 
		Finterface total = (a,b) -> a * b;
		System.out.println(total.multiply(5, 6));
		
		
		
	//	2nd way :Write a program to multiply 2 no's using Functional Interface
	// using BiFunctional Interface which is pre defined Functional Interface.
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Test the multiplication
        int number1 = 5;
        int number2 = 7;
        int result = multiply.apply(number1, number2);
        
        System.out.println(result);
	}

}
