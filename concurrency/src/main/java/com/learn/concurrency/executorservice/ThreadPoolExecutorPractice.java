package com.learn.concurrency.executorservice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class ThreadPoolExecutorPractice implements ExecutorServicePractice {
	// current pool size ranges between core pool size and max pool size.
	// threads are created and deleted based on pool type and keep alive time
	
	// initial size of pool
	private int corePoolSize;
	// max pool size 
	private int maxPoolSize;
	private long keepAliveTime;
	// queue from tasks are fetched
	private BlockingQueue<Runnable> workQueue;
	// a factory used to create threads
	private ThreadFactoryPractice threadFactory;
	private RejectedExecutionHandlerPractice handler;

	@Override
	public <T> Future<T> submit(Callable<T> task) {
		return null;
	}

	public ThreadPoolExecutorPractice(int corePoolSize, int maxPoolSize, long keepAliveTime,
			BlockingQueue<Runnable> workQueue) {
		super();
		this.corePoolSize = corePoolSize;
		this.maxPoolSize = maxPoolSize;
		this.keepAliveTime = keepAliveTime;
		this.workQueue = workQueue;
	}
	
	

}
