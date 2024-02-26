package com.cj.looping;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		
		System.out.println("HashSet started from here...");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(89);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("ArraysList started from here...");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(20);
		arrList.add(50);
		arrList.add(40);
		arrList.add(90);
		
		Iterator<Integer> itAl = arrList.iterator();
		while(itAl.hasNext()) {
			Integer num = itAl.next();
			System.out.println(num);
		}
				
		System.out.println("Priority started from here...");
		
		PriorityQueue<Integer> priQueue = new PriorityQueue<Integer>();
		priQueue.add(45);
		priQueue.add(50);
		priQueue.add(59);
		priQueue.add(90);
		
		Iterator<Integer> itPtQ = priQueue.iterator();
		
		while (itPtQ.hasNext()) {
			Integer integer = itPtQ.next();
			System.out.println(integer);
			
		}

	}

}
