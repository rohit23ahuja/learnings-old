package com.learn.concurrency.executorservice;

import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorsPractice {
public static ExecutorServicePractice newFixedThreadPool(int nThreads) {
	return new ThreadPoolExecutorPractice(nThreads, nThreads, 0L, new LinkedBlockingQueue<Runnable>());
}
}
