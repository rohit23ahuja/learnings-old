package com.learn.ds.bst;

public class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int i){
		data = i;
	}
	
	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

	public void setData(int data) {
		this.data = data;
	}

	
	
}
