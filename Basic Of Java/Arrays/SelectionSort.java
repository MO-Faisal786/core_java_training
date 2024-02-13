package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 8, 3};
        
        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
