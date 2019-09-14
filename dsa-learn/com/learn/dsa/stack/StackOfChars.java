package com.learn.dsa.stack;

public class StackOfChars {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackOfChars(int size) {
		maxSize = size;
		stackArray = new char[maxSize];
		top=-1;
	}
	
	public void push(char item){
		top++;
		stackArray[top]=item;
	}
	
	public char pop(){
		int old_top=top;
		top--;
		return stackArray[old_top];
	}
	
	public char peak(){
		return stackArray[top];
	}
	
	public boolean isFull(){
		return top==maxSize-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void display() {
		System.out.print("[");
		for (int i = 0; i < stackArray.length; i++) {
			System.out.print(stackArray[i]+" ");
		}
		System.out.print("] \n");
	}
}
