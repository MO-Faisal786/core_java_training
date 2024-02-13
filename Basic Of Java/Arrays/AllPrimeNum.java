package Arrays;

public class AllPrimeNum {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 4, 2 };
        System.err.print("The prime numbers in given array: ");
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if (arr[i] != 1) {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.print(arr[i] + " ");
                }
            }

        }
    }
}