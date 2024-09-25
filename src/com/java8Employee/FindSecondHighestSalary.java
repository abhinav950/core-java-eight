package com.java8Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestSalary {
	
	private String name;
    private double salary;
	public FindSecondHighestSalary(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
    
public static void main(String[] args) {
	  List<FindSecondHighestSalary> employees = Arrays.asList(
	            new FindSecondHighestSalary("John", 60000),
	            new FindSecondHighestSalary("Jane", 75000),
	            new FindSecondHighestSalary("Bob", 55000),
	            new FindSecondHighestSalary("Alice", 80000),
	            new FindSecondHighestSalary("Tom", 75000)
	        );
	  
	  Optional<Double> findFirst = employees.stream()
			  .map(FindSecondHighestSalary::getSalary)
			  .distinct()
			  .sorted()
			  .skip(1)
			  .findFirst();
}
    
}
