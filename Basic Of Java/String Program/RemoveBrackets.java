import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replaceAll("[{}()]", "");
        System.out.println(str);
        sc.close();
    }
}
