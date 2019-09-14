package com.learn.dsa.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertLast(23);
		myList.insertFirst(13);
		myList.insertFirst(22);
		myList.insertFirst(23);
		myList.insertFirst(7);
		myList.insertLast(88);
		myList.displayList();
	}

}
