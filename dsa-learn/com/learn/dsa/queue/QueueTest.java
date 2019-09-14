package com.learn.dsa.queue;

public class QueueTest {
	private int maxSize;
	private int[] items;
	private int front;
	private int rear;
	private int nItems;

	public QueueTest(int size) {
		maxSize = size;
		items = new int[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int i) {
		rear++;
		items[rear] = i;
		nItems++;
	}

	public int remove() {
		int temp = front;
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}
}
