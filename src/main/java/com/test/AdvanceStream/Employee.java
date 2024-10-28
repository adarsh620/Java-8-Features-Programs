package com.test.AdvanceStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }



    public static void main(String[] args) {
        // List of employees
        List<Employee> emp = Arrays.asList(
            new Employee("John", 5022),
            new Employee("Jane", 7511),
            new Employee("Doe", 12410),
            new Employee("Smith", 8009)
        );
        
        
        // way 1
        // Using streams to filter employees with even salaries and print their names
//        employees.stream()
//                .filter(emp -> emp.getSalary() >= 5000)  // Filter employees with even salary
//                .map(Employee::getName)                   // Get the name of the employee
//                .forEach(name -> System.out.println(name));            // Print the name
        
        
        // way 2 
        emp.stream()
        .filter(employee -> employee.getSalary() >= 5000)
        .map(employee -> employee.getName())  // can be written as "Employee::getName" using method referencing
//        .collect(Collectors.toList())  // optional waise no need 
        .forEach(name -> System.out.println(name));
        
        
    }
}
