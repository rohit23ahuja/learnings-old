package com.learn.concurrency.callablefuture;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		ArrayList<Future<Integer>> allFutures = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			allFutures.add(service.submit(new Task()));	
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = allFutures.get(i);
			//blocking operation main thread will wait t
			try {
				Integer result = future.get();
				System.out.println("Result of future #"+i+" = "+result);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		}
		service.shutdown();
	}
	
	static class Task implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			
			return new Random().nextInt();
		}
		
	}
}

