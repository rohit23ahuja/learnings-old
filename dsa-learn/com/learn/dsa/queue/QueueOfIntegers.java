package com.learn.dsa.queue;

public class QueueOfIntegers {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public QueueOfIntegers(int size) {
		maxSize = size;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public int remove(){
		int temp = queArray[front];
		front++;
		if(front==maxSize){
			front=0;
		}
		nItems--;
		return temp;
	}
	
	public void insert(int item){
		rear++;
		if(rear==maxSize-1){
			rear=-1;
		}
		queArray[rear]=item;
		nItems++;
	}
	
	public void view(){
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i]+" ");
		}
		System.out.print("]");
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public int getSize(){
		return nItems;
	}
}
