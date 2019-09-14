package com.learn.ds.problems.bst;

public class BST {
	private Node root;

	public BST() {
		root = null;
	}

	public void insert(int i) {
		root = insert(root, i);
	}

	private Node insert(Node node, int i) {
		if (node == null) {
			node = new Node();
			node.setData(i);
			return node;
		}
		if (node.getData() > i) {
			node.setLeft(insert(node.getLeft(), i));
		} else if (node.getData() <= i) {
			node.setRight(insert(node.getRight(), i));
		}
		return node;
	}

	public void traverse() {
		inDepthTraversal(root);
	}

	private void inDepthTraversal(Node node) {
		if (node != null) {
			inDepthTraversal(node.getLeft());
			System.out.println(node.getData());
			inDepthTraversal(node.getRight());
		}
	}

	public Node getRoot() {
		return root;
	}

	public void delete(int i) {
		delete(root, i);
	}

	private Node delete(Node node, int i) {
		if(node == null) return null;
		if (node.getData() < i) {
			node.setRight(delete(node.getRight(), i));
		} else if (node.getData() > i) {
			node.setLeft(delete(node.getLeft(), i));
		} else {
			if(node.getLeft() == null)	return node.getRight();
			if(node.getRight() == null) return node.getLeft();
			node.setData(minElement(node.getRight()));
			node.setRight(delete(node.getRight(),node.getData()));
		}
		return node;
	}

	private int minElement(Node node) {
		Node temp = node;
		while(temp.getLeft()!=null) {
			temp=temp.getLeft();
		}
		return temp.getData();
	}

}
