

public class REturnPosition {
    static int j = 0;
    static int [] findPositions(int arr[], int target) {
        int size = arr.length;
        for(int i=0; i<size; i++) {
            if (arr[i] == target) {
                arr[j++] = i; 
            }
        }
        if (arr[0] == target) {
            return arr;
        }
        return new int[]{-1};

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5,3};
        int target = 3;
        int result[] = findPositions(arr, target);
        System.out.println("The positions of three: ");
        for (int i=0; i<j; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
