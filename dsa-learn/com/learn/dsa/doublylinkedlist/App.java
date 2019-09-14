package com.learn.dsa.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(22);
		myList.insertFirst(44);
		myList.insertFirst(66);
		myList.insertFirst(11);
		myList.insertFirst(33);
		myList.insertFirst(55);
		myList.displayForward();
		System.out.println("Middle of list "+myList.getMiddle());
		
	}

}
