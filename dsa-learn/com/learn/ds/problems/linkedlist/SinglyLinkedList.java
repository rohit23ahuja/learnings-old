package com.learn.ds.problems.linkedlist;

public class SinglyLinkedList {
	private Node first;

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);
		first = newNode;
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.getNext();
		return temp;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void displayList() {
		System.out.println("List (first-->last)");
		Node temp = first;
		while (temp != null) {
			temp.displayNode();
			temp = temp.getNext();
		}
	}

	public Node middle() {
		Node slowptr, fastptr;
		slowptr = first;
		fastptr = first;
		while (fastptr != null && fastptr.getNext() != null) {
			fastptr = fastptr.getNext().getNext();
			slowptr = slowptr.getNext();
		}
		return slowptr;
	}

	public void deleteNode(Node node) {
		Node temp=first;
		while(temp.getNext()!=null){
			if (temp.getNext().getData()==node.getData()) {
				temp.setNext(temp.getNext().getNext());
			}
			temp=temp.getNext();
		}
		
	}
}
