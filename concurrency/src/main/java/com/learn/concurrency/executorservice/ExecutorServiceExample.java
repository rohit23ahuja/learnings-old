package com.learn.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 50; i++) {
			service.submit(new Task());
		}
		System.out.println("==============================");
		System.out.println("I am thread " + Thread.currentThread().getName());
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("I am thread " + Thread.currentThread().getName());
	}

}
