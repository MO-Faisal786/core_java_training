

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // if(num>0) {
        //     int a = 0;
        //     int b = 1;
        //     int c;
        //     System.out.print("The fibonacci series: "+a+" "+b+" ");
        //     for (int i = 2; i < num; i++) {
        //         c = a + b;
        //         a = b;
        //         b = c;
        //         System.out.print(c+" ");
        //     }
        // } else {
        //     System.out.println("Invalid Number...");
        // }
        System.out.print("The fibonacci series is ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i)+", ");
        }
        sc.close();
    }
}
