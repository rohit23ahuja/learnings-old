package com.learn.concurrency.reentrant.lock;

public class Person {
	private Object lock1 = new Object();
	private int age = 30;

	public int getAge() {
		synchronized (lock1) {
			return age;	
		}
		//return age;
	}
}
