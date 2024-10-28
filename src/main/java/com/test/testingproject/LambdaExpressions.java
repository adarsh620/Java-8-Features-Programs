package com.test.testingproject;

import java.util.function.BiConsumer;

public class LambdaExpressions {
	public static void main(String[] args) {
		// This is how we used to do thing before java 8; 
//		LambdaExpressions demo = new LambdaExpressions();
//		demo.add(10, 5);
//		
		
		// after java 8 :- by using lambda exp we can do this in 1 loc only :-
		BiConsumer<Integer, Integer> sum  = (a, b) -> System.out.println(a+b);
		sum.accept(100 , 5);
		
		// Implement the functional interface using a lambda expression
        MyFunctionalInterface greeter = (name) -> System.out.println("Hello, " + name);
        
        // Call the method
        greeter.greet("Adarsh");  // Output: Hello, Adarsh
        
        // Call the default method
        greeter.sayHello();  // Output: Hello!
		
	}
	
//	public void add(int a, int b) {
//		System.out.println(a+b);
//	}

}
