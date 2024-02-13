import java.util.Arrays;

class Day2 {

	static void removeDuplicates(char[] charArr, int arrLength) {
		int index = 0;
		for (int i=0; i<arrLength; i++) {
			int j;
			for (j=0; j<i; j++) {
				if (charArr[i] == charArr[j]) {
					break;
				}
			}

			if (j == i) {
				charArr[index] = charArr[i];
				index++;
			}
		}

		System.out.println(String.valueOf(Arrays.copyOf(charArr, index)));
	}


	public static void main(String[] args) {
		String str = "kolkata";

		char[] charArr = str.toCharArray();
		int arrLength = charArr.length;

		removeDuplicates(charArr, arrLength);
	}
}


 