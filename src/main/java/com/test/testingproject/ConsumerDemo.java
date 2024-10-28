package com.test.testingproject;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		
		// This is Consumer F.I which accepts single argument as input and return nothing,  such as printing a value, logging, or updating an object.
		Consumer<Integer> sum  = i -> System.out.println(i*i);
		sum.accept(5);
		
		Consumer<Integer> doubleMe  = i -> System.out.println(2 * i);
		doubleMe.accept(5);
		
		
		// this is how we do "Consumer Chaining" by using "andThen" method
		// here first sum will be called which will give '25' and then double me will be called which will give '10'.
		sum.andThen(doubleMe).accept(5);
		
	}

}
