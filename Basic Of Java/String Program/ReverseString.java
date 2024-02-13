
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.println("The reversed string: "+revStr);
        sc.close();
    }
}
