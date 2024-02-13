

import java.util.Scanner;

public class PositiveOrNegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num==0) {
            System.out.println("The given number is Zero.");
        } else {
            String result = num>0 ? "Positive" : "Negstive";
            System.out.println(result);
        } 
        sc.close();
    }
}
