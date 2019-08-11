package com.learn.concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
	private static BlockingQueue<Integer> queue;

	public static void main(String[] args) throws InterruptedException {
		queue = new LinkedBlockingQueue<>(10);
		ProducerConsumerUsingBlockingQueue p = new ProducerConsumerUsingBlockingQueue();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable r1 = () -> {
			for (int i = 0; i < 50; i++) {
				p.produce();
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 50; i++) {
				p.consume();
			}
		};
		
		executor.execute(r1);
		executor.execute(r2);
		System.out.println("size of queue " + queue.size());
	}

	public void produce() {
		try {
			queue.put(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consume() {
		try {
			queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
