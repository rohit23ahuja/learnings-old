package com.learn.dsa.multilevellinkedlist;

public class App {
	public static void main(String[] args) {
		Node root = null;
		MultiLevelList myList = new MultiLevelList();
		root = myList.insert(root, 20);
		root = myList.insert(root, 22);
		root = myList.insert(root, 25);
		root = myList.insert(root, 65);
		root = myList.insert(root, 70);
		
		root.setRight(myList.insert(root.getRight(), 7));
		root.setRight(myList.insert(root.getRight(), 12));
		root.setRight(myList.insert(root.getRight(), 23));
		root.setRight(myList.insert(root.getRight(), 34));

		root.getRight().setRight(myList.insert(root.getRight().getRight(), 10));
		root.getRight().setRight(myList.insert(root.getRight().getRight(), 15));
		root.getRight().setRight(myList.insert(root.getRight().getRight(), 17));
		root.getRight().setRight(myList.insert(root.getRight().getRight(), 18));
		
		root.getRight().getRight().setRight(myList.insert(root.getRight().getRight().getRight(), 32));
		root.getRight().getRight().setRight(myList.insert(root.getRight().getRight().getRight(), 39));
		root.getRight().getRight().setRight(myList.insert(root.getRight().getRight().getRight(), 40));
		myList.displayList(root);
	}
}
