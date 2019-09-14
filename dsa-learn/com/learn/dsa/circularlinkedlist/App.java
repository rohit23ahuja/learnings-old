package com.learn.dsa.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(13);
		myList.insertFirst(22);
		myList.insertFirst(23);
		myList.insertFirst(7);
		myList.insertLast(88);
		myList.deleteLast();
		myList.displayList();
	}

}
