package com.cj.list;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
//		// to understand iterator 
//		Vector<String> v = new Vector<String>();//by using generics no need of type casting and it helps to achieve safety as well
//		v.add("Faisal");
//		v.add('A'); // it return error: is not applicable for the another arguments except generics 
		
		// to understand iterator 
//		Vector v = new Vector();// without generics 
		Vector<Integer> v = new Vector<Integer>(); // with generics
		v.add(10);
//		v.add(20.43);// Without generics we can add any type of value
		v.add(100);
		v.add(200);
		
		Iterator<Integer> it = v.iterator(); // it return implementation class object of Iterator interface
		
		while(it.hasNext()) { // hasNext() method return true if the element is present in the list or vector
			Integer obj = it.next(); // next() method return the element we put it into a object class ref var because we don't know what type of object is being returned by the iterator
			int i = obj.intValue();
			System.out.println(i);
			
		}
		
	}

}
