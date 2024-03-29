

import java.util.Scanner;

public class AdditionOfTwoFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of x1, y1, x2, y2: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = x1*y2 + x2*y1;
        int y3 = y1*y2;
        int div;
        if (x3>y3) {
            div = y3;
        } else {
            div = x3;
        }

        for (int i = div; i > 0; i--) {
            if (x3%i==0 && y3%i==0) {
                x3/=i;
                y3/=i;
            }
        }

        System.out.println("The sum of fractions is "+x3+"/"+y3+".");
        
        sc.close();
    }
}
