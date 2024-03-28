package com.cj.lamdaExpression;

public class LamdaWithArgs {
	public static void main(String[] args) {
		
		ForArgs f = (num1, num2) -> { //lamda expression with parameter
			return num1+num2;
		};
		
		System.out.println(f.add(10, 20));
	}
}
