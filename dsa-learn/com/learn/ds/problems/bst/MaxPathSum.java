package com.learn.ds.problems.bst;

public class MaxPathSum {
	static int result = Integer.MIN_VALUE;

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(59);
		bst.insert(23);
		bst.insert(93);
		bst.insert(34);
		bst.insert(34);
		bst.insert(7);
		bst.insert(67);
		bst.insert(106);
		//bst.traverse();
		maxSum(bst);
	}

	private static void maxSum(BST bst) {
		maxSum(bst.getRoot());
		System.out.println(result);
	}

	private static int maxSum(Node node) {
		if(node == null) return 0;
		int l = maxSum(node.getLeft());
		int r = maxSum(node.getRight());
		int maxlr = Math.max(l, r);
		int maxSingle = Math.max(maxlr+node.getData(), node.getData());
		int maxAll = Math.max(maxSingle, l+r+node.getData());
		result = Math.max(result, maxAll);
		return maxSingle;
	}



}
