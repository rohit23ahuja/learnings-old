package com.learn.ds.problems.bst;

public class MinDepth {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(40);
		bst.insert(20);
		bst.insert(80);
		bst.insert(15);
		bst.insert(100);
		bst.insert(120);
		bst.insert(8);
		bst.insert(25);
		bst.insert(22);
		bst.insert(30);
		bst.insert(4);
		bst.insert(24);
		bst.insert(26);
		minDepth(bst);
		// bst.delete(20);
		// bst.traverse();
	}

	private static void minDepth(BST bst) {
		System.out.println(minDepth(bst.getRoot()));
	}

	private static int minDepth(Node node) {
		if (node == null)
			return 0;
		if (node.getLeft() == null && node.getRight() == null)
			return 1;
		if(node.getLeft()==null) return 1 + minDepth(node.getRight());
		if(node.getRight()==null) return 1 + minDepth(node.getLeft());
		return Math.min(1+minDepth(node.getLeft()), 1+minDepth(node.getRight()));
	}
}
