
public class Day11 {
    public static void main(String[] args) {
        String str = "ABDEFGABEF";
        int[] arr = new int[256];

        int left = 0;
        int max = 0;
        for (int right = 0; right < str.length(); right++) {
            arr[str.charAt(right)] = right;
            right++;
        }

    }
}
