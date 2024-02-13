package scannerclassDemo;

import java.util.Scanner;

public class scannerClasaDemo {
	public static void main(String[] args) {
		System.out.println("This is the scanner class....");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();
	}
}
