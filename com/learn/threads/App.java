package com.learn.threads;

public class App {
	public static void main(String[] args) {
		//sleepExample();
		waitExample();
	}

	private static void waitExample() {
		Employee e = new Employee();
		e.setName("rohit");
		e.setAge(29);
		synchronized (e) {
			try {
				e.wait(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		System.out.println(e.toString());
	}

	private static void sleepExample() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After 5 secs");

	}
}
