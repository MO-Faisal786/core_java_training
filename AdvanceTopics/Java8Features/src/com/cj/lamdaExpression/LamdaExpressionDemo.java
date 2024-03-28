package com.cj.lamdaExpression;

public class LamdaExpressionDemo {

	public static void main(String[] args) {
//		A a = new Aimpl(); //simple way
//		a.m1();
		
//		A a = new A() { // Anonymous implementation class
//			public void m1() {
//				System.out.println("m1() is override by anonymous implementation class...");				
//			}
//		};
//		
//		a.m1();
		
		
		A a = () -> {
			System.out.println("m1() is override by using lamda expression...");
		};
		
		a.m1();
	}

}
