

public class ArmStrong1To1000 {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers: ");
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int temp = i;
            int digits = 0;
            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (i == sum)
                System.out.print(i + ", ");
            

        }
    }
}
