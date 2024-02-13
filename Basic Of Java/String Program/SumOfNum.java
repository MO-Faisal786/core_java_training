import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with numbers: ");
        String str = sc.nextLine();
        int sum = 0;
        char[] arr = str.toCharArray();
        for(char c : arr){
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
