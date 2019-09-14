package com.learn.dsa.circularlinkedlist;

import com.learn.dsa.singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		// optional things to do
		first = null;
		last = null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			last = newNode; // if the list is empty the first item created is also the Last
		}
		newNode.setNext(first); // new node must refer to whatever was Old first
		first = newNode;
	}

	public void insertLast(int data){
		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			first = newNode;
		} else {
			last.setNext(newNode); // the next value of the Old Last node will point to the new node
			last=newNode;			
		}

	}
	
	public int deleteFirst() {
		int temp = first.getData();
		if (first.getNext()==null) {
			last=null;
		} 
		first = first. getNext();
		return temp;
	}
	
	public int deleteLast(){
		Node old_last = last;
		Node temp = first;
		while(temp.getNext()!=last) {
			temp=temp.getNext();
		}
		last=temp;
		last.setNext(null);
		return old_last.getData();
	}
	
	public void displayList() {
		System.out.println("List (First-->Last)");
		Node current = first;
		while(current!=null){
			current.displayNode();
			current = current.getNext();
		}
		System.out.println();
	}

	private boolean isEmpty() {
		return first == null;
	}
}
