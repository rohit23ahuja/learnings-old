package com.learn.concurrency.producerconsumer;

public class ProducerConsumer {
	private static int count;
	private static int[] buffer;
	private static Object lock = new Object();

	public static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	public static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	static class Producer {
		public void produce() {
			synchronized (lock) {
				if (isFull(buffer)) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				lock.notifyAll();
			}
		}
	}

	static class Consumer {
		public void consume() {
			synchronized (lock) {
				while (isEmpty(buffer)) {
					try {
						lock.wait(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				lock.notifyAll();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		buffer = new int[10];
		count = 0;
		Producer p = new Producer();
		Runnable r1 = () -> {
			for (int i = 0; i < 50; i++) {
				p.produce();
			}
			System.out.println("Done producing");
		};

		Consumer c = new Consumer();
		Runnable r2 = () -> {
			for (int i = 0; i < 52; i++) {
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

		System.out.println("size of buffer " + count);
	}
}
