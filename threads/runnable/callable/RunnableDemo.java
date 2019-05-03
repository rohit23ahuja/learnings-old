package learn.threads.runnable.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future f = exec.submit(new MyRunnable(5));
		exec.shutdown();
		
		Thread t = new Thread(new MyRunnable(5));
		t.start();
	}
}

class MyRunnable implements Runnable{
	int value;
	public MyRunnable(int v){
		value=v;
	}
	@Override
	public void run() {
		int fact =1;
		while( value >= 1) {
			fact=fact*value--;
		}
		System.out.println(fact);
	}
}
