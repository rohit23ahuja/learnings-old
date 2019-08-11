package com.learn.concurrency.volatilekeyword;

public class VolatileExample {
	public static volatile long value;
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			value=0l;
			while(value<50000l){
				value = value+1;				
			}
		};
		
		Runnable r2 = () -> {
			System.out.println(value);
		};
		Thread[] t1 = new Thread[20];
		for (int i = 0; i < t1.length; i++) {
			if (i%2==0) {
				t1[i] = new Thread(r1);	
			} else {
				t1[i] = new Thread(r2);
			}
			
		}
		

		for (Thread t : t1) {t.start();}
		for (Thread t : t1) {t.join();}
	}
}
