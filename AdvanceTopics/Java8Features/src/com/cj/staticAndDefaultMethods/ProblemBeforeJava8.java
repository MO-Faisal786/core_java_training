package com.cj.staticAndDefaultMethods;

public class ProblemBeforeJava8 {

	public static void main(String[] args) {
		MyInterface demo = new ImpA();
		demo.m1();
		demo.m2();
		MyInterface.m3();
		demo.m4();
	}

}
