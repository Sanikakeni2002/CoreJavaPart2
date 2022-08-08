package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeRunner {
public static List<Employee> getEmployeeDetails(){
	List< Employee> emp=new ArrayList<Employee>();
	emp.add(new Employee(11,"Piyu",30000));
	emp.add(new Employee(12,"Mayuri",40000));
	emp.add(new Employee(13,"Savita",50000));
	emp.add(new Employee(14,"Sayali",60000));
	return emp;
	
}
	public static void main(String[] args) {
		//Predicate<Employee>e1= e->e.name.startsWith("P")&& e.salary>50000;
		Predicate<Employee> e1= e->e.salary< 40000;
		List<Employee> l= getEmployeeDetails();
		//boolean b= l.stream().anyMatch(e1);
		//boolean b= l.stream().allMatch(e1);
		boolean b= l.stream().noneMatch(e1);
		System.out.println(b);
	}

}
