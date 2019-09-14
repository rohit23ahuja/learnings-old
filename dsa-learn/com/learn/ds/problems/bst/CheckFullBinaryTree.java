package com.learn.ds.problems.bst;

public class CheckFullBinaryTree {
	public static void main(String[] args) {
		BSTTest bstTest = new BSTTest();
		bstTest.insert(62);
		bstTest.insert(33);
		bstTest.insert(87);
		bstTest.insert(76);
		bstTest.insert(93);
		bstTest.insert(107);
		bstTest.insert(24);
		bstTest.insert(12);
		bstTest.insert(44);
		bstTest.insert(37);
		bstTest.insert(53);
		bstTest.insert(27);
		bstTest.insert(89);
		checkIfTreeIsFullBinaryTree(bstTest);
		bstTest.delete(76);
		checkIfTreeIsFullBinaryTree(bstTest);
	}

	private static void checkIfTreeIsFullBinaryTree(BSTTest bstTest) {
		System.out.println(checkIfTreeIsFullBST(bstTest.getRoot()));
	}

	private static boolean checkIfTreeIsFullBST(Node node) {
		if(node==null) return true;
		if(node.getLeft()==null && node.getRight()==null) return true;
		if(node.getLeft()!=null&&node.getRight()!=null)
			return checkIfTreeIsFullBST(node.getLeft()) && checkIfTreeIsFullBST(node.getRight());
		return false;
	}
}
