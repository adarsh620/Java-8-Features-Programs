package com.test.CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3, 7, 8, 5, 5, 5);
		System.out.println("Limit Example");
		numbers.stream().limit(5).forEach(x -> System.out.println(x)); // wiill return only till 5th index  output will be :- 1,2,3,4,5
		
		System.out.println("Skip Example");
		numbers.stream().skip(4).forEach(x -> System.out.println(x)); // will return from 8th element only o/p will be 7,8,5,5,5
	}

}
