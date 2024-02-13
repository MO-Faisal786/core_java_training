
class MaximumPossibleTime {

	// public static String maxPossibleTime(int[] A) {
    //     String ans = "";
    //     for (int i = 0; i < 4; ++i) { // i==0
    //         for (int j = 0; j < 4; ++j) { // j==1
    //             for (int k = 0; k < 4; ++k) { //k==2
    //                 if (i == j || i == k || j == k) continue;// true // avoid duplicate among i, j & k. 
    //                 String h = "" + A[i] + A[j], m = "" + A[k] + A[6 - i - j - k], t = h + ":" + m; // hour, minutes, & time.
    //                 if (h.compareTo("24") < 0 && m.compareTo("60") < 0 && ans.compareTo(t) < 0) ans = t; // hour < 24; minute < 60; update result.
    //             }
    //         }
    //     }
    //     return ans;
    // }

	static String maxPossibleTime(int[] A) {
        String ans = "";
        int first = 0;
        int second = 0;
        int three = 0;
        int four = 0;
        for (int i = 0; i < 4; ++i) { 
           if ((i > first && i <= 2)) {
              first = i;            
           }
           if ((i > second && i <= 3 )) {
              second = i;            
           }
           if ((i > three && i <= 5)) {
              three = i;            
           }
           if ((i > four && i <= 9)) {
              four = i;            
           }
        }
        ans += first+""+second+":"+three+""+four;
        return ans;
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(maxPossibleTime(arr));
	}
}