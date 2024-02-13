
public class PerfectNum {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("The number " + num + " is a perfect number");
        } else {
            System.out.println("The number " + num + " is not a perfect number");
        }

    }
}
