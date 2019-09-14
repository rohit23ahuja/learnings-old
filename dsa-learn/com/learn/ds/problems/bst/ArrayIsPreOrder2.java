package com.learn.ds.problems.bst;

public class ArrayIsPreOrder2 {

	private static int[] A = {45, 25, 15, 35, 75};
	
	public static void main(String[] args) {
		System.out.println(isBst());
	}

	private static boolean isBst() {
		Stack preOrderStack = new Stack(A.length+1);
		Stack inOrderStack = new Stack(A.length+1);
		for (int i = 0; i < A.length; i++) {
			if(preOrderStack.isEmpty()|| preOrderStack.peak()>A[i]){
				preOrderStack.push(A[i]);
			} else {
				while(!preOrderStack.isEmpty()&&preOrderStack.peak()<A[i]) {
					int removed = preOrderStack.pop();
					if (!inOrderStack.isEmpty()&&removed<inOrderStack.peak()) {
						return false;
					}
					inOrderStack.push(removed);;
				}
				preOrderStack.push(A[i]);
			}
		}
		return true;
	}
}

class Stack {
	int maxSize;
	int[] items;
	int top;
	
	Stack(int size) {
		top = -1;
		items = new int[size];
		maxSize = size;
	}
	
	public void push(int i) {
		top++;
		items[top] = i;
	}
	
	public int peak() {
		return items[top];
	}
	
	public int pop() {
		int old_top = top;
		top--;
		return items[old_top];
	}
	
	public boolean isEmpty() {
		return top ==-1;
	}
}
