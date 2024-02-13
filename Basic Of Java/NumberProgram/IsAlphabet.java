
import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        if ((c >= 'A' && c <= 'z') || (c >= 'a' && c <= 'z')) {
            System.out.println("The given character is an Alphabet.");
        } else {
            System.err.println("The given character is not an Alphabet.");
        }
        sc.close();
    }
}
