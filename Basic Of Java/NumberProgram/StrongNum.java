
import java.util.Scanner;

public class StrongNum {
    public static int factorial(int n) { 
        if (n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int rem;
        int temp = num;
        while (temp != 0) {
            rem = temp%10;
            sum+= factorial(rem);
            temp/=10;
        }

        if(sum == num){
            System.out.println("The given number "+num+" is a Strong number.");
        } else {
            System.out.println("The given number "+num+" is not a Strong number.");
        }
        sc.close();
    }
}
