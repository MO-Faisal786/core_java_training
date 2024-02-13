package com.cj.string;

public class Mutable {
	public static void main(String[] args) {
		String name1 = "Faisal";
		System.out.println("Before concatinate: "+name1);
		name1.concat(" Malik");
		System.out.println("After concatinate: "+name1);
		
//		StringBuffer sbName = new StringBuffer("Faisal");
//		sbName.append(" Malik");
//		System.out.println(sbName);
		
		StringBuilder sbName = new StringBuilder("Faisal");
		sbName.append(" Malik");
		System.out.println(sbName);
		
	}
}
