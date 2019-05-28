package com.learn.concurrency.reentrant.lock;

public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.getCompany());
	}
}
