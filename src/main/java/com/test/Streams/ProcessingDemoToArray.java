package com.test.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProcessingDemoToArray {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(24);
		arList.add(21);
		arList.add(50);
		
		
		// here we are getting the stream object 
		Stream<Integer>  createdStream = arList.stream();
		//Here we have configured the stream.
		Stream<Integer>  filteredStream   = createdStream.filter(i -> i >= 10);
		// here we are converting filtered stream into object array.
		Object[] arr = filteredStream.toArray();
		//printing the array, // we can't use "forEach." becoz it no more a streams , it is converted into array. 
		for (Object o : arr) {
			System.out.println(o);
		}
	}

}
