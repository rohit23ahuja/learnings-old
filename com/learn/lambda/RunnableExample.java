package com.learn.lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In thread");
			}
		});
		
		myThread.start();
		
		Thread myThread2 = new Thread(()-> System.out.println("In thread 2"));
		myThread2.start();
	}
}
