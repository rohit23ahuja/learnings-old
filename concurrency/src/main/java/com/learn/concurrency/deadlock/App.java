package com.learn.concurrency.deadlock;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Deadlock d = new Deadlock();
		Runnable r1 = () -> d.a();
		Runnable r2 = () -> d.b();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		t1.join();
		t2.join();
	}

}
