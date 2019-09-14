package com.learn.ds.graph;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}
	
	public void insertLast(String s) {
		Node node = new Node();
		node.setData(s);
		if (first==null) {
			first = node;
			return;
		}
		Node temp = first; 
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(node); 
	}
	
	public void display() {
		Node temp = first;
		while(temp!=null) {
			System.out.print("-->" + temp.getData());
			temp = temp.getNext();
		}
		System.out.println();
	}
}
