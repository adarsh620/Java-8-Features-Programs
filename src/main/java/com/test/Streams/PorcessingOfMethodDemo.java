package com.test.Streams;

import java.util.stream.Stream;

public class PorcessingOfMethodDemo {

	public static void main(String[] args) {
		
		Stream.of(1,11,123,1234,12345,123456,1234567).forEach(x -> System.out.println(x));
	   Stream.of("John", "Jane", "Doe", "Smith").filter(i -> i.length() > 3).forEach(x -> System.out.println(x));
	   
	   // Example of how i used this in Repay Project :-
	   Stream<String> paymentStatuses = Stream.of("COMPLETED", "PENDING", "FAILED", "COMPLETED");

       // Process and filter only the completed payments
       long completedPayments = paymentStatuses
           .filter(status -> status.equals("COMPLETED"))  // Filter completed payments
           .count();  // Count how many completed payments are there

       System.out.println("Total completed payments: " + completedPayments);
       
	}
	
}
