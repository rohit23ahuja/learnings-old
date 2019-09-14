package com.learn.dsa.multilevellinkedlist;

public class Node {
	private int data;
	private Node right;
	private Node down;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}

	public Node (int data) {
		this.down=null;
		this.right=null;
		this.data=data;
	}

}
