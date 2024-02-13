package Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] num = {4, 6, 7, 2, 8, 3};
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0) {
                System.out.println("Even: "+num[i]);
            } else {
                System.out.println("Odd :"+num[i]);
            }
        }
    }
}
