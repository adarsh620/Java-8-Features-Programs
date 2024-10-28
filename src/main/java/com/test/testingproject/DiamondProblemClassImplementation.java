package com.test.testingproject;

public class DiamondProblemClassImplementation implements DiamondProblemInterface1, DiamondProblemInterface2 {
	
	@Override
	public void m1() {
		DiamondProblemInterface1.super.m1();
	}
	
	public static void main(String[] args) {
		DiamondProblemClassImplementation diamondDemo = new DiamondProblemClassImplementation();
		diamondDemo.m1();
		
//	 The diamond problem is a common issue in languages that support multiple inheritance, like C++. It arises when a class inherits from two or more classes that have a common base class. Here's a brief explanation of the diamond problem:
//
//Suppose class A is the base class.
//Classes B and C both inherit from class A.
//Class D then inherits from both B and C.
//In this case, if class A has a method, and B and C do not override it, class D inherits the same method from both B and C. The ambiguity arises because it's unclear whether class D should inherit the method from B or C.
//This problem is called the diamond problem because the inheritance structure looks like a diamond shape:
//    A
//   / \
//  B   C
//   \ /
//    D
	}
}
