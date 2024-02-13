
import java.util.Scanner;

public class Replace0To1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int newNum = 0;
        if(num == 0) {
            num = 1;
        }
        while (num != 0) {
            int rem = num%10;
            if (rem == 0) {
                rem = 1;
            }
            newNum = newNum*10+rem;
            num /= 10;
        }
        num = 0;
        while (newNum != 0) {
            int rem = newNum%10;
            num = num * 10 + rem;
            newNum /= 10;
        }

        System.out.println(num);
        sc.close();
    }
}
