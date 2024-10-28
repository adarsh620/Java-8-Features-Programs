package com.test.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessStreamCountDemo {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(14);
		arList.add(21);
		arList.add(50);
		arList.add(100);
		arList.add(270);
		
		
		Stream<Integer>  createdStream = arList.stream();
		Stream<Integer>  filteredStream   = createdStream.filter(i -> i >= 20);
		long countDemo = filteredStream.count();
		System.out.println(countDemo);
		
		
		// we can apply count() on raw stream as well .
		System.out.println("In Single Line");
		long  createdStream1 = arList.stream().count();
		System.out.println(createdStream1);
	}
}