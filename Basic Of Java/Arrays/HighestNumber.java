package Arrays;

public class HighestNumber {
    public static void main(String[] args) {
        int[] num = {4, 10, 7, 2, 8, 3};
        int highestNum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (highestNum < num[i]) {
                highestNum = num[i];
            }
        }
        System.out.println("The highest number is "+highestNum);
    }
}
