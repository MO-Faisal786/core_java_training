class BlockTest {
	static int i;
	BlockTest(int no) {
		System.out.println(i);
		i = no;
	}

	{
		System.out.println(i);
		i = 10;
	}

	static {
		System.out.println(i);
		i = 20;
	}

	static void m(int no) {
		System.out.println(i);
		i = no;
	}

	public static void main(String[] args) {
		System.out.println(i);
		new BlockTest(30);
		System.out.println(i);
		m(40);
		System.out.println(i);
	}
}