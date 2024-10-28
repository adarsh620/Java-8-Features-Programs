package com.test.testingproject;
import java.util.function.Function;


public class FucntionalChaining {

	public static void main(String[] args) {
		
		// function 1
		Function<Integer, Integer> squareIt = i -> 2*i;
		System.out.println("This square of the number is : " + squareIt.apply(2));
		
		// function 2
		Function<Integer, Integer> cubeIt = i -> i * i * i;
		System.out.println("This cube of the number is : " + cubeIt.apply(2));
		
		
		// functional chaining 
		// Using 'andThen'
		System.out.println("Functional chaining : after calculation  using 'andThen' : " + squareIt.andThen(cubeIt).apply(2));
		
	     // Using 'compose'
		System.out.println("Functional chaining : after calculation  using 'compose' : " + squareIt.compose(cubeIt).apply(2));
		
		
	}
		
}
	

