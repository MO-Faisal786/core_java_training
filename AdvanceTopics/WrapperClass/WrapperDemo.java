package com.cj.wrapperclass;

public class WrapperDemo {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("This is int "+ i);
		
		Integer iObj = new Integer(10); //Boxing
		System.out.println("Integer object "+iObj);
		
		int j = iObj.intValue();//Unboxing
		System.out.println("This is also int "+j);
		
		int priJ = 20;
		
		Integer jobj = priJ; // auto boxing
		System.out.println("This is the jobj "+jobj);
		
		priJ = jobj; // auto unboxing
		System.out.println("This is now primitive value "+jobj);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		
		
	}
}
