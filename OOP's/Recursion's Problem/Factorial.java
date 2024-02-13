class Factorial {
	static int fact(int num) {
		if(num == 0)
			return 0;
		if(num == 1)
			return 1;
		return num * fact(num-1);
	}
	public static void main(String[] args) {
		int num = 4;
		System.out.println("The factorial of "+num+" is "+fact(num));
	}
}