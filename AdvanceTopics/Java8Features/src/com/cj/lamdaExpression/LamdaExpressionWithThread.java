package com.cj.lamdaExpression;

public class LamdaExpressionWithThread {
	public static void main(String[] args) {
//		MyRunnableThread m = new MyRunnableThread();
//		
//		Thread t = new Thread(m);
//		t.start();
		
		Runnable r = () -> {
			System.out.println("my thread is ready to execute...");
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}
