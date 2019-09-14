package com.learn.ds.problems.linkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(6);
		myList.insertFirst(5);
		myList.insertFirst(4);
		myList.insertFirst(3);
		myList.insertFirst(2);
		myList.insertFirst(1);
		myList.displayList();
		System.out.println();
		myList.middle().displayNode();
		System.out.println();
		myList.deleteNode(myList.middle());
		myList.displayList();
	}

	
}
