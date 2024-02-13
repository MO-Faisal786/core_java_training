

public class FibonacciSereis {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Fibonacci Series upto " + num);
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.print(a+" "+b);
        while (c<num) {
            System.out.print(" "+c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
