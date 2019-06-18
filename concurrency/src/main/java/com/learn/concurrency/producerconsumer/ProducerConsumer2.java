package learn.threads.producerconsumer;

public class ProducerConsumer2 {
	private static int[] buffer;
	private static int count;
	private static Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {
		buffer = new int[10];
		
		Runnable r1 = () -> {
			for (int i = 0; i < 50; i++) {
				consume();
			}
			System.out.println("Done consuming");
		};
		
		Runnable r2 = () -> {
			for (int i = 0; i < 50; i++) {
				produce();
			}
			System.out.println("Done producing");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Size of buffer "+count);
	}
	
	public static void produce() {
		synchronized (lock) {
			if(count==buffer.length){
				try {
					System.out.println("Producing "+Thread.currentThread().getName()+" going into wait as buffer full");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("PRODUCING");
			buffer[count++]=1;
			lock.notify();
		}
	}
	
	public static void consume(){
		synchronized (lock) {
			if(count==0){
				try {
					System.out.println("Consuming "+Thread.currentThread().getName()+" going into wait as nothing to consume");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("CONSUMING");
			buffer[--count]=0;
			lock.notify();
		}
	}
}
