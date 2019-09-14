package com.learn.ds.bst;

public class BST {
	private Node root;

	public BST() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void insert(int i) {
		root = insert(root, i);
	}

	private Node insert(Node node, int i) {
		if (node == null) {
			return new Node(i);
		}
		if (node.getData() > i) {
			node.setLeft(insert(node.getLeft(), i));
		} else if (node.getData() < i) {
			node.setRight(insert(node.getRight(), i));
		} else {
			System.out.println("Cannot insert duplicates");
			System.exit(1);
		}
		return node;
	}

	public void search(int i) {
		Node node = search(root, i);
		if (node == null) {
			System.out.println("Element not found");
			return;
		}
		System.out.println(node);
	}

	private Node search(Node node, int i) {
		if (node == null || node.getData() == i)
			return node;
		if (node.getData() > i)
			return search(node.getLeft(), i);
		return search(node.getRight(), i);
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.getLeft());
			System.out.println(node.getData());
			inOrderTraversal(node.getRight());
		}
	}

	public void delete(int i) {
		delete(root, i);
	}

	private Node delete(Node node, int i) {
		if (node == null)
			return null;
		if (node.getData() > i) {
			node.setLeft(delete(node.getLeft(), i));
		} else if (node.getData() < i) {
			node.setRight(delete(node.getRight(), i));
		} else {
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();
			node.setData(minValue(node.getRight()));
			node.setRight(delete(node.getRight(), node.getData()));
		}
		return node;

	}

	private int minValue(Node node) {
		int min = node.getData();
		while (node.getLeft() != null) {
			min = node.getLeft().getData();
			node = node.getLeft();
		}
		return min;
	}

}
