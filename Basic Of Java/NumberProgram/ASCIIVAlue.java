

import java.util.Scanner;

public class ASCIIVAlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char c = sc.next().charAt(0);

        System.err.println((int)(c));
        sc.close();
    }
}
