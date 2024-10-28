package com.test.testingproject;

public class DiamondProblemClassImplementation implements DiamondProblemInterface1, DiamondProblemInterface2 {
	
	@Override
	public void m1() {
		DiamondProblemInterface1.super.m1();
	}
	
	public static void main(String[] args) {
		DiamondProblemClassImplementation diamondDemo = new DiamondProblemClassImplementation();
		diamondDemo.m1();
	}
}
