import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter zero or one: ");
        int input = sc.nextInt();
        input = 1 - input;
        System.out.println(input);
        sc.close();
    }    
}