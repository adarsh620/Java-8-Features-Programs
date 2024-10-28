package com.test.Streams;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxDemoPorcessesing {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(14);
		arList.add(21);
		arList.add(50);
		arList.add(100);
		arList.add(270);
		
		
		
		
		
		// we can use directly on streams as well as after filter or mapping of streams as well
		Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);
		
		Integer maxValue = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxValue);
		
	}

	

}
