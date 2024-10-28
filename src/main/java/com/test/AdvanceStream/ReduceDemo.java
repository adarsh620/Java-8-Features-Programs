package com.test.AdvanceStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {
	public static void main(String[] args) {
		
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	// Summing all elements using reduce()
	int sum = numbers.stream()
	                 .reduce(0, (a, b) -> a + b);  // Identity = 0, operation = sum

	System.out.println("Sum: " + sum);  // Output: Sum: 15
	
	
	
	// another example of reduce 
	Stream<String> names = Stream.of("Johnny", "Jane", "Doe");

	String result = names.reduce("", (a, b) -> a + b);  // Concatenates all names

	System.out.println(result);  // Output: JohnJaneDoe


	}
}
