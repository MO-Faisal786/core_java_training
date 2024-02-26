package com.cj.list;

import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		
		while(st.size()>0) {
			System.out.println(st.pop());
		}
	}
}
