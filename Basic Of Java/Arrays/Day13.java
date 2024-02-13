

public class Day13 {
    public static void main(String[] args) {
        // int[] arr = {2,7,11,15};
        // int target = 9;

        // int[] arr = {3,2,4};
        // int target = 6;

        int[] arr = {3,3};
        int target = 6;

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j] == target) {
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}