package com.learn.concurrency.producerconsumer;

public class ProducerConsumer {
	private static int count;
	private static int[] buffer;
	
	public static boolean isEmpty(int[] buffer){
		return count==0;
	}
	
	public static boolean isFull(int[] buffer){
		return count==buffer.length;
	}
	
	static class Producer {
		public void produce(){
			while(isFull(buffer)){}
			buffer[count++]=1;
		}
	}
	
	static class Consumer {
		public void consume(){
			while(isEmpty(buffer)){}
			buffer[--count]=0;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		buffer = new int[10];
		count=0;
		Producer p = new Producer();
		Runnable r1 = () -> {
			for (int i = 0; i < 50; i++) {
				p.produce();
			}
			System.out.println("Done producing");
		};
		
		Consumer c = new Consumer();
		Runnable r2 = () -> {
			for (int i = 0; i < 50; i++) {
				c.consume();
			}
			System.out.println("Done consuming");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("size of buffer "+count);
	}
}
