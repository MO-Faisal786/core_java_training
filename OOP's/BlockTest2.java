class BlockTest2 {

	char c;

	BlockTest2(char n) {
		c = n;
		System.out.println(c);
	}

	{
		c = 'A';
		System.out.println(c);
	}

	void m(char n) {
		System.out.println(c); 
		c = n;
	}

	public static void main(String[] args) {
		BlockTest2 bt = new BlockTest2('B');
		System.out.println(bt.c);
		bt.m('C');
		System.out.println(bt.c);
	}
}