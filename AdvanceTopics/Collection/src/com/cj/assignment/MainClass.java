package com.cj.assignment;

public class MainClass {

	public static void main(String[] args) {
		MyArrayList arrList = new MyArrayList();
		arrList.add(10);
		arrList.add(46);
		arrList.add(29);
		arrList.add(76);
		arrList.add(90);
		arrList.add(43);
		arrList.add(24);
		arrList.add(23);
		
		System.out.println("The size of your array is "+arrList.size());
		System.out.println("The elements of your array: ");
		arrList.iterate();

	}

}
