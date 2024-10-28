package com.test.CodingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3, 7, 8, 5, 5, 5);
		
		Set<Integer> set = new HashSet<>();
		numbers.stream()
		.filter(x -> !set.add(x)) // hum set me add krte jaege elements ko (we know that set me unique elements jate hai to agr usko "!" not operator lga denge to wo hme duplicates elements de dega
		.collect(Collectors.toSet()) // bina collect kre list me , wo duplicate k sare occurence print kr de rha tha , to isiliye ek Set me store kra diya after filtering .
		.forEach(x -> System.out.println(x));
	}

}
