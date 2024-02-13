

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int rem; 
        while (num != 0) {
           rem = num%10;
           sum+=rem;
           num/=10;
        }
        System.out.println("The sum of all digits is "+ sum+".");
        sc.close();
    }
}
