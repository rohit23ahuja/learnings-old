package com.learn.dsa.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;

	public boolean isEmpty(){
		return first==null;
	}
	
	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);
		first = newNode;
	}
	
	public Node deleteFirst(){
		Node temp = first;
		first = first.getNext();
		return temp;
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
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.setData(data);
		Node temp = first;
		while(temp.getNext()!=null){
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
}
