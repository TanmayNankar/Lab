package com.cg.demo.conc;

public class App implements Runnable {
	public static void main(String[] args) {



		for (int i = 1; i <= 10; i++) {
			Thread thread = new Thread(new App());
			thread.start();
		}

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - "+ i);
		}
	}
}