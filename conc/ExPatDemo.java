package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExPatDemo implements Runnable {
	public static void main(String[] args) {

		// 0. using Thread object
//		for (int i = 1; i <= 10; i++) {
//			Thread thread = new Thread(new App());
//			thread.start();
//		}

		ExPatDemo exp = new ExPatDemo();

		// 1. using newSingleThreadExecutor() method
		// creates an Executor that uses a single worker thread operating off an
		// unbounded queue

//		ExecutorService exService = Executors.newSingleThreadExecutor();

		
		
		// 2. using newCachedThreadPool() method
		// creates a thread pool that creates new threads as needed but will reuse
		// previously constructed threads when they are available
//		ExecutorService exService = Executors.newCachedThreadPool();

		
		
		// 3.using newFixedThreadPool() method
//		ExecutorService exService = Executors.newFixedThreadPool(3);

		
		
		// 4.using newScheduledThreadPool() method
		ExecutorService exService = Executors.newScheduledThreadPool(3);
//       ScheduledExecutorService exService = Executors.newScheduledThreadPool(3);
		
		
		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);

		}
		exService.shutdown();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}
