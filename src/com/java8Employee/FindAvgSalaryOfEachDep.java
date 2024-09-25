package com.java8Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAvgSalaryOfEachDep {
	
	 private String name;
	    private double salary;
	    private String department;

	    public FindAvgSalaryOfEachDep(String name, double salary, String department) {
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	    }

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
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

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		
		  public void increaseSalary(double percentage) {
		        this.salary += this.salary * percentage / 100;
		    }
	    
	    
	    public static void main(String[] args) {
	    List<FindAvgSalaryOfEachDep> employees = Arrays.asList(
	    	            new FindAvgSalaryOfEachDep("John", 60000, "HR"),
	    	            new FindAvgSalaryOfEachDep("Jane", 75000, "Engineering"),
	    	            new FindAvgSalaryOfEachDep("Bob", 55000, "HR"),
	    	            new FindAvgSalaryOfEachDep("Alice", 80000, "Engineering"),
	    	            new FindAvgSalaryOfEachDep("Tom", 75000, "Marketing")
	    	        );
	    	 
	    Map<String, Double> averageSalaries  = employees.stream()
	    .collect(Collectors.groupingBy(FindAvgSalaryOfEachDep::getDepartment,
	    		Collectors.averagingDouble(FindAvgSalaryOfEachDep::getSalary)));
	    
	    employees.forEach(emp -> emp.increaseSalary(10));
	    
		}

}
