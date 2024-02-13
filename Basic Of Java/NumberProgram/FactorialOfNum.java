
import java.util.Scanner;

public class FactorialOfNum {

    public static int factorial(int num) {
        if (num==0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // int fac = 1;
        // for (int i = num; i >=2; i--) {
        //     fac *= i;
        // }
        // System.out.println("The factorial of "+num+ " is "+ fac+".");
        System.out.println(factorial(num));
        sc.close();
    }
}
