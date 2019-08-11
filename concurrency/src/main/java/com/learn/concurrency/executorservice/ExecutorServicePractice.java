package com.learn.concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

interface ExecutorServicePractice {
	<T> Future<T> submit(Callable<T> task);

}
