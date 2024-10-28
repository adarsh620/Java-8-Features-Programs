package com.test.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(14);
		arList.add(21);
		arList.add(50);
		arList.add(100);
		arList.add(270);
		
		// natural ordering sorting 
		System.out.println("Natural order sorting");
		Stream<Integer>  createdStream = arList.stream();
		Stream<Integer>  filteredStream   = createdStream.filter(i -> i >= 20);
		Stream<Integer> sortedDemo = filteredStream.sorted();
		sortedDemo.forEach(x -> System.out.println(x));
		
		// custom ordering sorting 
		System.out.println("custom order sorting using comaparator");
		Stream<Integer>  createdStream1 = arList.stream();
		Stream<Integer>  filteredStream1   = createdStream1.filter(i -> i >= 20);
		Stream<Integer> sortedDemo1 = filteredStream1.sorted((i1, i2) -> i2.compareTo(i1));
		sortedDemo1.forEach(x -> System.out.println(x));
		
	}
}