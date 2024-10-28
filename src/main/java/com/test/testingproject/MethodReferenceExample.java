package com.test.testingproject;


import java.util.function.BiFunction;

public class MethodReferenceExample {
    public static int add(int a, int b) {
        return a + b;
    }
    
   	public static void testImplementation() {
    System.out.println("This is test implementation of your Abstract metod using Method referencing ");
    }
    

    
    public static void main(String[] args) {
        // Lambda expression
        BiFunction<Integer, Integer, Integer> addition = (a, b) -> MethodReferenceExample.add(a, b);
        

        // Method reference to the static method : example 1
        BiFunction<Integer, Integer, Integer> additionMethodRef = MethodReferenceExample::add;

        System.out.println("Using Lambda Exp :" + addition.apply(10, 20));           // Output: 30
        System.out.println("Using Method Referencing :" + additionMethodRef.apply(10, 20)); // Output: 30
        
        
        
     //   method referencing example 2
        MyFunctionalInterfaceDemo demo = MethodReferenceExample::testImplementation;
        demo.singleAbstractMethod();
       
        // this is how can write lamda exp for the same .
        MyFunctionalInterfaceDemo demo1 = () -> System.out.println("This is test implementation of your Abstract method using lambda expression");
        demo1.singleAbstractMethod();
    }


}