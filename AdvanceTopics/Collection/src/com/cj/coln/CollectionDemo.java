package com.cj.coln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		System.out.println("Arrays starts here...s");
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 60.90;
		arr[4] = 40;
		System.out.println("Before: "+Arrays.toString(arr));
		
		int c = arr[1];
		arr[4] = arr[3];
		arr[3] = arr[2];
		arr[2] = c;
		arr[1] = 50;
	
		System.out.println("After: "+Arrays.toString(arr));
		System.out.println();
		System.out.println("Collection start here...");
		
		ArrayList col = new ArrayList();
		col.add(20);
		col.add(30);
		col.add(70);
		col.add(53.99);
		System.out.println("Before: "+col);
		
		col.add(1, 50);
		
		System.out.println("After: "+ col);
		
	}
}
