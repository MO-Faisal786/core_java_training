import java.util.Scanner;

public class Fabonacci {
    static Scanner sc = new Scanner(System.in);
    static int i;
    static int num;

    static void fabonacci(int n1, int n2) {
        System.out.print(n1+" ");
        if(i == num)
          return;
        i++;
        fabonacci(n2, n1+n2);
    }

    public static void main(String[] args) {
        System.err.println("Enter the number.");
        Fabonacci.num = Fabonacci.sc.nextInt();
        int n1 = 0, n2 = 1;
        fabonacci(n1, n2);
    }
}
