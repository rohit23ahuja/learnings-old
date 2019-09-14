package com.learn.ds.problems.bst;

public class ArrayIsPreOrder3 {
	private static int[] A = { 45, 25, 15, 35, 75 };

	public static void main(String[] args) {
		System.out.println(isBst());
	}

	private static boolean isBst() {
		Stack3 descendingOrderStack = new Stack3(A.length);
		int topElementAtInOrderStack = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			int data = A[i];
			if (data < topElementAtInOrderStack)
				return false;
			while (!descendingOrderStack.isEmpty() && descendingOrderStack.peak() < data) {
				topElementAtInOrderStack = descendingOrderStack.pop();
			}
			descendingOrderStack.push(data);
		}
		return true;
	}

}

class Stack3 {
	private int top;
	private int maxSize;
	private int[] items;

	Stack3(int size) {
		top = -1;
		items = new int[size];
		maxSize = size;
	}

	public int pop() {
		int old_top = top;
		top--;
		return items[old_top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int peak() {
		return items[top];
	}

	public void push(int i) {
		top++;
		items[top] = i;
	}
}