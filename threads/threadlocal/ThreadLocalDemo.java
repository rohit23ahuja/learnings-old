package learn.threads.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread local Demo
 * 1. Context object is the entity that holds transaction id.
 * 2. MyThreadLocal is just a container object. It contains ThreadLocal field that holds our transaction id as we set Context instance in it.
 * 3. Business service is our business logic. we can get our Context object in it using ThreadLocal 
 * 4. ThreadLocal must be removed once work is done. Because if thread is reused, we would have stale value. 
 */
public class ThreadLocalDemo {
	public static void main(String[] args) {
		ExecutorService s = Executors.newFixedThreadPool(20);
		for (int i = 0; i < 25; i++) {
			s.execute(new MyRunnable());
		}
		s.shutdown();
	}



}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// sample code to simulate transaction id
		Context context = new Context();
		context.setTransactionId(Thread.currentThread().getId()+"-"+String.valueOf(SequenceGen.nextNum()));
		// set the context object in thread local to access it somewhere else
		MyThreadLocal.set(context);
		/* note that we are not explicitly passing the transaction id */
		new BusinessService().businessMethod();
		MyThreadLocal.unset();
		
	}
	
}
