package com.cj.staticAndDefaultMethods;

public interface StaticDefaultMethodInterface {
	public static void staticMethod() {
		System.out.println("This is the static method of interface.");
	}
	
	public default void defaultMethod() {
		System.out.println("This is the default method of interface.");
	}

}
