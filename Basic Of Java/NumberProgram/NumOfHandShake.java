
import java.util.Scanner;

public class NumOfHandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people in the room: ");
        int num = sc.nextInt();
        int totalHandShake = num * (num - 1) / 2;
        System.out.println("The total number of handshakes are "+totalHandShake+".");
        sc.close();
    }
}
