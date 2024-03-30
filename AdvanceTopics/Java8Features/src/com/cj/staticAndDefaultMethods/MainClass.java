package com.cj.staticAndDefaultMethods;

public class MainClass {
	public static void main(String[] args) {
		StaticDefaultMethodInterface.staticMethod();
		StaticDefaultMethodInterface ref = new ImplClass();
		ref.defaultMethod();
		
	}
}
