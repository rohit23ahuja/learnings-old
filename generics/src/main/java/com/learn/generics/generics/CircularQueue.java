package com.learn.generics.generics;

public class CircularQueue {
	private Object[] queue;
	private int readCursor=0;
	private int writeCursor=0;
	
	public CircularQueue(int size) {
		queue = new Object[size];
	}

	public boolean offer(Object obj) {
		//if()
		return false;
	}

	public Object poll() {
		return null;
	}

}
