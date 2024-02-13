

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        System.out.println(digits);

        temp = num;
        while (temp != 0) {
            int rem = temp%10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }


        if (num == sum)
        System.out.println(num + " is an Armstrong number");
        else
        System.out.println(num + " is not an Armstrong number");
        
    }
}
