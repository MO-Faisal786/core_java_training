package com.cj.looping;
import java.util.*;

public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(30);
		arrList.add(50);
		arrList.add(60);
		arrList.add(90);
		
		for(Integer integer : arrList) { // for-each loop works only in forward direction
			System.out.println(integer);
		}
	}

}