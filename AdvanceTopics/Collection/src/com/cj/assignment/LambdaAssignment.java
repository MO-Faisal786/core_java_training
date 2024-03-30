package com.cj.assignment;

import java.util.TreeSet;

public class LambdaAssignment {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>((o1, o2) -> {
			String str1 = (String) o1;
			String str2 = (String) o2;
			return -(str1.compareTo(str2));
		});
		ts.add("Faisal");
		ts.add("Hashma");
		ts.add("Sonali");
		ts.add("Shubham");
		ts.add("Azam");
		
		for(String s : ts) {
			System.out.println(s);
		}
		
		
	}

}
