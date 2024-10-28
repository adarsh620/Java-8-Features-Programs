package com.test.CodingQuestions;

import java.util.stream.IntStream;

public class Refactor {
	public static void main(String[] args) {
		System.out.println(isPrime(11));
		
	}
	
	public static boolean isPrime(int num) {
//		boolean isDivisible = false;
//		
//		for(int i=2;i<num;i++) {
//			if(num%i == 0) {
//				isDivisible = true;
//				break;
//			}
//		}
		//return num>1 && !isDivisible;
		
		// by using java 8 we can do like this :-
		return num>1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
		
	}

}
