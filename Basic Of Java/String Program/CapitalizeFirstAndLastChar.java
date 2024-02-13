import java.util.Scanner;

public class CapitalizeFirstAndLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        // First Way
        str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
        str = str.replace(str.charAt(str.length()-1), Character.toUpperCase(str.charAt(str.length()-1)));
        System.out.println(str);
        // // Second Way
        // String[] strArr = str.split("\\s");
        // System.out.println(strArr);
        sc.close();
    }
}
