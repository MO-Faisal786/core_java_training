
public class Day4 {

    static int[] sortArray(int[] arr, int n) {
        // Find the length of array

        // Iterate through first half and make it ascending
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 7, 3, 1, 6, 8 };
        int n = arr.length;
        arr = sortArray(arr, n);

        int i;
        for (i = 0; i < n/2; i++) {
            System.out.print(arr[i]+" ");
        }
        
        for (i = n-1; i >= n/2; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
