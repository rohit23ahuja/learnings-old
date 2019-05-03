package learn.threads.runnable.callable;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<Integer> f = exec.submit(new MyCallable(6));
		//Future<Integer> f = exec.submit(new MyCallable(0));
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}


class MyCallable implements Callable<Integer>{
	int value;
	public MyCallable(int v) {
		value=v;
	}
	@Override
	public Integer call() throws Exception {
		int fact =1;
		if (value==0) {
			throw new NumberFormatException("cannot calculate factorial of zero");
		}
		while(value>=1) {
			fact=fact*value--;
		}
		return fact;
	}
}



