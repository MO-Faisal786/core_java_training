package com.cj.coln;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
//		// To check Element is added or not 
//		Set hashSet = new HashSet();
//		boolean status = hashSet.add(20);
//		System.out.println(status);
//		hashSet.add(30.78);
//		hashSet.add('A');
//		status = hashSet.add(20);
//		System.out.println(status);
//		hashSet.add("String");
//		
//		System.out.println("The created HashSet is "+hashSet+".");
		
		
//		Set hashSet = new HashSet();
//		hashSet.add(20);
//		hashSet.add(30.78);
//		hashSet.add('A');
//		hashSet.add("String");
//		
//		System.out.println("The created HashSet is "+hashSet+"."); //No order 
		
//		Set linkedhashSet = new LinkedHashSet();
//		linkedhashSet.add(20);
//		linkedhashSet.add(30.78);
//		linkedhashSet.add('A');
//		linkedhashSet.add("String");
//		
//		System.out.println("The created LinkedHashSet is "+linkedhashSet+"."); //Preserve Insertion order
//		
//		Set treeSet = new TreeSet();
//		treeSet.add(20);
//		treeSet.add(10);     // Note: Elements/Objects must be comparable or same type
//		treeSet.add(7);
//		treeSet.add(30);
//		
//		System.out.println("The created LinkedHashSet is "+treeSet+"."); // Ascending/Descending Order
		
		
		// Another example
		Set hashSet = new HashSet();
		
		Students st1 = new Students();
		st1.setId(101);
		st1.setName("Faisal");
		st1.setDept("CSE");
//		System.out.println(st1.hashCode());
		
		Students st2 = new Students();
		st2.setId(102);
		st2.setName("Malik");
		st2.setDept("IT");
//		System.out.println(st2.hashCode());
		
		Students st3 = new Students();
		st3.setId(102);
		st3.setName("Malik");
		st3.setDept("IT");
//		System.out.println(st3.hashCode());
		System.out.println(st2.equals(st3));
		
		hashSet.add(st1);
		hashSet.add(st2);
		hashSet.add(st3); 
		
		System.out.println(hashSet);

	}

}
