package com.cj.list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(30);
		arrList.add(40);
		arrList.add(20);
		arrList.add(56);
		
		System.out.println(arrList);
		
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(20);
		linkedList.add(56);
		
		System.out.println(linkedList);
		
		
	}

}

