package com.java.interview.oops.constructor.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PolymorphismDemo {
	
	private List<Employee> sortBy(ArrayList<Employee> employee, int num) {
		return employee.stream().
				sorted((s1,s2) -> Integer.compare(s1.getSalary(), s2.getSalary()))
				.collect(Collectors.toList());
				               
	}

	private List<Students> sortBy(ArrayList<Students> student) {
		return student.stream()
		               .sorted((n1, n2) -> n2.getName().compareTo(n1.getName()))
		               .collect(Collectors.toList());	               
		
	}

	public static void main(String[] args) {

		
		ArrayList<Students> student = new ArrayList<Students>();
		
		Students s1 = new Students(1, "Arun", "Mechanical", 10);
		Students s2 =  new Students(2, "Chandra", "Mechanical",9);
		Students s3 = new Students(3, "Logesh", "EEE",8);	
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Arun",80000);
		Employee e2 =  new Employee(2, "Chandra",60000);
		Employee e3 = new Employee(3, "Logesh",90000);	
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		PolymorphismDemo demo = new PolymorphismDemo();
		List <Students> stu = demo.sortBy(student);
		stu.forEach(System.out::println);
		
		int num = 1;
		List <Employee> em= demo.sortBy(employee, num);
	    em.forEach(System.out::println);
			
		
	}


}
