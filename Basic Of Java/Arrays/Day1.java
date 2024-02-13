
public class Day1 {

	static void getPairs(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				int num = arr[i] + arr[j];
				for (int k=0; k<arr.length; k++) {
					if (num == arr[k]) {
						System.out.println("("+arr[i]+", "+arr[j]+")");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 7, 15, 19, 4};

		getPairs(arr);
	}
}


