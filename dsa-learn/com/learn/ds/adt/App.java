package com.learn.ds.adt;

public class App {

	public static void main(String[] args) {
		Counter counter = new Counter("Rohit");
		for (int i = 0; i < 230; i++) {
			counter.increment();
		}
		System.out.println("Counter current value"+counter.getCurrentValue());
		System.out.println(counter);
	}

}
