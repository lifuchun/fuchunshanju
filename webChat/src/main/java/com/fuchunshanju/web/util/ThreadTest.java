package com.fuchunshanju.web.util;

public class ThreadTest implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (ticket > 0) {
				System.out.println("ticket=" + ticket--);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest test  = new ThreadTest();
		new Thread(test).start();
		new Thread(test).start();
		new Thread(test).start();
	}
}


