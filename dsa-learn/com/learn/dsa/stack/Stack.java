package com.learn.dsa.stack;

public class Stack {
	private int maxSize; // to maintain size of stack
	private long[] stackArray; // container to store list of items
	private int top; // index of last item on top of stack

	public Stack(int size) {
		this.maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}

	// data will get overriden in the array when after popping, we are again pushing in the stack
	// pointer increments by 1. data inserted at new pointer location
	public void push(long item) throws Exception {
		if(isFull()){
			throw new Exception("Stack Full");
		}
		top++;
		stackArray[top] = item;
	}

	// we are not removing values from the underlying array just playing the pointer variable top.
	// pointer gets reduced by 1
	public long pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Already Empty");
		}
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public long peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top ==-1;
	}
	
	public boolean isFull(){
		return maxSize-1 == top;
	}
}
