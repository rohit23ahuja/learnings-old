package com.learn.concurrency.racecondition;

public class LongWrapper {
	private Object key = new Object();
	private long l;

	public LongWrapper(long v) {
		l = v;
	}
	
	// synchronized read is needed to get the last written in the incrment synchronized block
	public long getValue() {
		synchronized(key){
			return l;	
		}
	}

	public void incrementValue() {
		synchronized (key) {
			l = l + 1;
		}
	}
}
