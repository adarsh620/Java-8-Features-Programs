package com.test.AdvanceStream;

import java.util.stream.Stream;

public class PeekDemo {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("Johnny", "xyz", "Jackie", "Doelly");
//                .filter(name -> name.startsWith("J"))  // Intermediate
//                .map(name -> name + " Honey" )
//                .filter(name -> name.length() >= 4)
//                .peek(System.out::println)  // Prints filtered names for debugging
//                .map(String::toUpperCase);  //  Converts filtered names to uppercase after peeking
//
//                names.forEach(System.out::println); // Terminal operation
		
		
		
               // in one line 
                names.filter(name -> name.startsWith("J")).map(name -> name + " Honey").peek(System.out::println).forEach(System.out::println);
                

	}
}
