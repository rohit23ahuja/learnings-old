package com.learn.concurrency.racecondition;

public class LongWrapper {
	private Object key = new Object();
	private long l;

	public LongWrapper(long v) {
		l = v;
	}

	public long getValue() {
		return l;
	}

	public void incrementValue() {
		synchronized (key) {
			l = l + 1;
		}
	}
}
