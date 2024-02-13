
import java.util.Scanner;


public class ConcatinateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two string: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Concatinated String: "+str1+str2);
        sc.close();
    }
}
