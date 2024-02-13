package com.java.scannerClass;

import java.util.Scanner;

public class ScannerAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter a number or zero");
			num = sc.nextInt();
			System.out.println("The squre of "+num+" is "+num*num);
			System.out.println("=================================");
		} while (num != 0);
		
		System.out.println("Thank You!");
		System.out.println("Thank You!");
		System.out.println("Thank You!");
		System.out.println("Thank You!");
		System.out.println("Thank You!");
		System.out.println("Thank You!");
		
		sc.close();
		

	}

}
