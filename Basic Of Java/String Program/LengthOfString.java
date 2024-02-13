import java.util.Scanner;

public class LengthOfString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            int count = 0;
            char[] arr = str.toCharArray();
            for(char c : arr){
                count++;
            }
            System.out.println(count);
            sc.close();
        }
}
