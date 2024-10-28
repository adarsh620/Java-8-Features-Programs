package com.test.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessStreamCollectDemo {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(14);
		arList.add(21);
		arList.add(50);
		
		
		// here we are getting the stream object 
		Stream<Integer>  createdStream = arList.stream();
		//Here we have configured the stream.
		Stream<Integer>  filteredStream   = createdStream.filter(i -> i >= 20);
		// after configuring here we have processes the configured stream into a new stream using  collect() method
		// basically we have collect the filtered stream into a new stream.
		List<Integer> newFilteredStream = filteredStream.collect(Collectors.toList());
		newFilteredStream.forEach(x -> System.out.println(x)); // here we have print the new stream.
		
		
		// Now all the in single line only :-
		System.out.println("Single line Demo");
		arList.stream().filter(i -> i >= 20).collect(Collectors.toList()).forEach(x -> System.out.println(x)); 
		
		
		
	}

}
