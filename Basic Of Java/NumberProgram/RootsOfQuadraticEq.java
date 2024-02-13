

import java.util.Scanner;

public class RootsOfQuadraticEq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            System.out.println("Two real root.");
            System.out.println("Roots are " + (-b + Math.sqrt(d)) / 2 * a + " and " + (-b - Math.sqrt(d)) / 2 * a);
        } else if (d == 0) {
            System.out.println("Roots are equal");
            System.out.println("Roots are " + (-b / 2 * a));
        } else {
            System.out.println("Roots are not real.");
            System.out.println("Roots are " + -b / (2 * a) + "+i" +
                    Math.sqrt(-d) / (2 * a) + " and "
                    + -b / (2 * a) + "-i" + Math.sqrt(-d) / (2 * a));

        }
        sc.close();
    }
}