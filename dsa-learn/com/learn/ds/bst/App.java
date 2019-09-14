package com.learn.ds.bst;

public class App {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(323);
		bst.insert(126);
		bst.insert(794);
		bst.insert(67);
		bst.insert(36);
		bst.insert(2);
		bst.insert(233);
		bst.insert(144);
		bst.insert(132);
		bst.insert(456);
		bst.insert(801);
		bst.insert(176);
		bst.insert(602);
		bst.insert(491);
		bst.insert(932);
		bst.insert(156);
		//bst.search(10);
		
		bst.inOrderTraversal();
		System.out.println("\n");
		bst.delete(144);
		bst.inOrderTraversal();
	}
}
