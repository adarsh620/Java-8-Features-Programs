package com.test.CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachWords {
	public static void main(String[] args) {
		String str = "hello java world hello world java streams";
	//	String str1 = str.toLowerCase();
		
		// Step 1 :- convert string into arrays and spilt it by whitespace (" ")
		List<String> list = Arrays.asList(str.split("\\s+"));
		
		/*
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) is telling that ;-
            Group words by themselves (Function.identity()).
            Count how many times each word appears (Collectors.counting()).
            
            
            Function.identity() is a static method that returns a function. This function, when applied to an input, returns the input itself.
            Collectors.counting() is a special collector that counts the number of elements in each group.

		 */
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		
	}

}
