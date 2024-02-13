import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replaceAll("[aeiou]", "");
        System.out.println(str);

        sc.close();
    }
}
