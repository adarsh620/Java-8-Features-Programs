package com.test.testingproject;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		// this is how  do this normal by making and external method (testStringLength) but the main reason behind the java 8  was to reduce the line of codes. 
		PredicateFunctionalInterfaceDemo predicateDemo = new PredicateFunctionalInterfaceDemo();
		System.out.println(predicateDemo.testStringLength("adarsh shukla"));
		
		//but using predicates we can do it like this :-
		Predicate<String> checkLength = s -> (s.length() >= 10);   // this is declaration and implementation of predicate method
		System.out.println("The lenght of String is greatar than 10 : "+ checkLength.test("Consistency is the key"));  // using "test" method we are calling our predicate method
		
		Predicate<String> checkLengthIsEven = s -> (s.length() % 2) == 0; 
		System.out.println("The lenght of String is even : " + checkLengthIsEven.test("Consistency is the keys"));
		
		
		/* now above there are two predicates we can join them by using "and()" , "or()", "negate()" like this
		 This is called 'Predicate Joining' 
		*/
		
		// 1. Using and
		System.out.println("The lenght is greater than  'and' is also even "+ checkLength.and(checkLengthIsEven).test(""));
		
		// 2. using or
		System.out.println("The lenght is greater than 'or' it is even "+ checkLength.or(checkLengthIsEven).test(""));
		
		// 3. Using Negate
		System.out.println("The lenght is greater than 10 (will 'negate' the answer) "+ checkLength.negate().test(""));
	}
	
	public boolean testStringLength(String s) {
		if(s.length() >= 18) {
			return true;
		}else {
			return false;
		}
	}
	

}
