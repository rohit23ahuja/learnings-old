package com.learn.pattern.singleton;

public class App {
	public static void main(String[] args) {
Thread t1 = new Thread(new MyRunnable());
Thread t2 = new Thread(new MyRunnable());
t1.run();
t2.run();
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		DBSingleton instance = DBSingleton.getInstance();
		System.out.println(instance);
	}
	
}
