package com.learn.ds.problems.bst;

public class BSTTest {
	private Node root;

	public BSTTest() {
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
			node = new Node();
			node.setData(i);
		}
		if (node.getData() > i) {
			node.setLeft(insert(node.getLeft(), i));
		} else if (node.getData() < i) {
			node.setRight(insert(node.getRight(), i));
		}
		return node;
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
	
	
	public void search(int i){
		Node node = search(root, i);
		if(node == null) {
		 System.out.println("Not found");	
		} else {
			System.out.println(node);
		}
	}

	private Node search(Node node, int i) {
		if(node == null) return null;
		if(node.getData()==i) {
			return node;
		}
		if(node.getData()>i) {
			return search(node.getLeft(), i);
		}
		return search(node.getRight(), i);
	}
	
	public void delete(int i) {
		delete(root, i);
	}

	private Node delete(Node node, int i) {
		if(node==null) return null;
		if(node.getData()>i) {
			node.setLeft(delete(node.getLeft(), i));
		} else if(node.getData()<i) {
			node.setRight(delete(node.getRight(), i));
		} else {
			if(node.getLeft()==null) {
				return node.getRight();
			}
			if(node.getRight()==null) {
				return node.getLeft();
			}
			if(node.getLeft()!=null && node.getRight()!=null) {
				node.setData(minElement(node.getRight()));
				node.setRight(delete(node.getRight(), node.getData()));
			}
		}
		return node;
	}

	private int minElement(Node node) {
		Node temp = node;
		while(temp.getLeft()!=null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}
}
