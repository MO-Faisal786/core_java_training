class Day3 {
	public static void main(String[] args) {
		String str = "I'm not a great programmer , I'm just a good programmer with great habits.";
		String[] strArr = str.split(" "); 

		for (int i=0; i<strArr.length; i++) {
			for (int j=i+1; j<strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					strArr[j]="remove";
				}
			}
		}
		str = "";
		// remove the words that have been set to "remove"
		for(String word: strArr){
			if (word != "remove") {
				str = str + word + " ";
			}
		}
		System.out.println(str);
	}
}