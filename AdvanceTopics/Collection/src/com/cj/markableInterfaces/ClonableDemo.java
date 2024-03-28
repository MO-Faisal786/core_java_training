package com.cj.markableInterfaces;



public class ClonableDemo extends Object {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Faisal", 120);
		Employee emp2 = (Employee)emp.clone();
		
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
	}
}
