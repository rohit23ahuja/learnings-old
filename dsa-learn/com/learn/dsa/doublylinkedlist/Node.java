package com.learn.dsa.doublylinkedlist;

/**
 * in doubly linked last we have three fields - data, previous and next
 * 
 * @author deepikaahuja
 *
 */
public class Node {
	private int data;
	private Node next;
	private Node previous;

	public void displayNode() {
		System.out.println("{" + data + "}");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
}
