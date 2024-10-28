package com.test.Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo {
     public static void main(String[] args) {
    	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    	 
        // without streams 
//		List<Integer> arrayListFromMethod = findElements(numbers);
//    	 for (Integer i : arrayListFromMethod) {
//			System.out.println(i);
//		}
    	 
    	 
    // this is how we do it using streams :-
    // here we have covered both "Filter" and "Map" both
    	 List<Integer> streamDemo = numbers.stream()
    			 .filter(n -> n >= 10) // intermediate operation :: will filter the stream based on given arguments.
    			 .map(n -> n+1) // add 1 more to each elements of the filter stream 
    			 .collect(Collectors.toList()); // terminate operation :: will collect the result into a new list.
    	 
    	 System.out.println("using streams :"+streamDemo); // [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    	// streamDemo.forEach(x->System.out.println(x)); // another way of printing : it will give output in without array such as 10,12,14,16,18,2

    	 // we can do this in one line also like :-
    	 numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(x->System.out.println(x));
     }
     
     
    // without streams  
//    public static List<Integer> findElements(List<Integer> arList){
//        List<Integer> newAI = new ArrayList<Integer>();
//        for (Integer i : arList) {
//			if(i >= 15) {
//				newAI.add(i);
//			}
//        }
//			return newAI;
//		}
}
	

