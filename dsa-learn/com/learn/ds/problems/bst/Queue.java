package com.learn.ds.problems.bst;

public class Queue<T> {
	private int maxSize;
	private T[] queArray;
	private int front;
	private int rear;
	private int nItems;

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		maxSize = size;
		queArray = (T[]) new Object[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}

	public void insert(T t) {
		rear++;
		queArray[rear] = t;
		nItems++;
	}

	public T remove() {
		T temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public T peekFront() {
		return queArray[front];
	}
	
	public T peekRear() {
		return queArray[rear];
	}


	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}
}
