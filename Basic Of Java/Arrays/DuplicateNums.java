package Arrays;

public class DuplicateNums {
    public static void main(String[] args) {
        int[] arr = {2,4,7,2,1,3,4,1};
        System.out.print("Duplicates elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j]+" ");
                }
            }
            
        }
    }
}
