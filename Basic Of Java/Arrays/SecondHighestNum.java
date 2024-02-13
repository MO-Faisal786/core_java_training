package Arrays;

public class SecondHighestNum {
    public static void main(String[] args) {
        int[] arr = {78, 109, 309, 48, 255, 309, 255};
        // int[] arr = {78, 78, 78, 78, 78, 78};
        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                System.out.println("The second highest number is "+arr[i]);
                return;
            }
        }
        System.out.println("There is no second highest number in this list.");
    }
}
