package com.cj.staticAndDefaultMethods;

interface MyInterface {
	 void m1();
	 void m2();
	 public static void m3() {
		 System.out.println("This is the m3() method");
	 }
	 public default void m4() {
		 System.out.println("This is the default m4() method");
	 }

}


