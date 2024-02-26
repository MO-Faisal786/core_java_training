package com.cj.looping;
import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(30);
		arrList.add(89);
		arrList.add(80);
		arrList.add(45);
		
		ListIterator<Integer> listIt = arrList.listIterator();
		
		System.out.println("This is the forword...");
		while(listIt.hasNext()) {
			Integer num = listIt.next();
			System.out.println(num);
		}
		
		System.out.println("This is the backword...");
		while (listIt.hasPrevious()) {
			Integer integer = listIt.previous();
			System.out.println(integer);
			
		}
		

	}

}
