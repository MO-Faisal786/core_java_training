package com.cj.string;

public class StringDemo {
	public static void main(String[] args) {
		/*
		 * char[] a = {'F','a','i','s','a','l'}; for (int i = 0; i < a.length; i++) {
		 * System.out.print(a[i]); } System.out.println(); String name = "Faisal";
		 * System.out.println(name);
		 */
		
		String name1 = "Faisal";
		System.out.println(name1);
		String name3 = new String("Faisal");
		System.out.println(name3);
		
		String name2 = "Faisal";
		String name4 = new String("Faisal");
		
		System.out.println(name2);
		System.out.println(name4); 
		
		System.out.println(name1==name2);
		System.out.println(name3 == name4);
		
		System.out.println(name1.equals(name2));
		System.out.println(name3.equals(name4));
	}
}
	