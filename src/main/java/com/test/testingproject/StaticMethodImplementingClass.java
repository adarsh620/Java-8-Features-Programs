package com.test.testingproject;

public class StaticMethodImplementingClass implements StaticMethodInterface {
	public static void main(String[] agrs) {
		// that is why static methods were introduced in java 8 ; as they are utility method ; hence no need to create new object and all we can directly call this like this (using InterfaceName.methodName()
		StaticMethodInterface.staticMethod();
		
		
		// will give error that is why Static Methods are not  available to implementing classes by default as it is only available to its interface (StaticMethodInterface) not its child implementing that class i.e (StaticMethodImplementingClass) 
//		StaticMethodImplementingClass staticMeth = new StaticMethodImplementingClass();
//		staticMeth.staticMethod();
	}

}
