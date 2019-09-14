package com.learn.dsa.multilevellinkedlist;

public class MultiLevelList {
	private Node root;

	public Node insert(Node node, int data) {
		if (node == null) {
			return new Node(data);
		}
		node.setDown(insert(node.getDown(), data));
		return node;
	}

	public MultiLevelList() {
		root = null;
	}

	public void displayList(Node root) {
		while (root.getRight() != null) {
			System.out.println("{" + root.getData() + "}");
			while (root.getDown() != null) {
				System.out.println("| \n | \n | v");
				System.out.println("{" + root.getData() + "}");
				root = root.getDown();
			}
			root = root.getRight();
			System.out.println("-->");
		}
	}

	public void printFinalList(){
		
	}
	public Node flatten(Node node) {
		if (node == null || node.getRight() == null)
			return node;
		return merge(node, flatten(node.getRight()));
	}

	private Node merge(Node first, Node second) {
		Node temp = null;
		Node finalList = temp;
		while (first != null && second != null) {
			if(first.getData()<second.getData()){
				temp.setDown(first);
				first = first.getDown();
			} else {
				temp.setDown(second);
				second = second.getDown();
			}
			temp = temp.getDown();
		}
		temp.setDown(first!=null?first:second);
		finalList.getDown().setRight(null);
		return finalList;
	}
}
