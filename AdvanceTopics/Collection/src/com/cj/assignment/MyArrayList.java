package com.cj.assignment;

public class MyArrayList {
	private int arr[] = new int[5];
	private int index = 0;
	
	public boolean add(int data) {
		if(this.index == this.arr.length) {
			int newArr[] = new int[this.arr.length*2];
			for(int i = 0; i<arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[this.index++] = data;
		return true;
	}
	
	public int size() {
		return this.index;
	}
	
	public void iterate() {
		for(int i=0; i<this.index; i++) {
			System.out.println(this.arr[i]);
		}
	}
}
