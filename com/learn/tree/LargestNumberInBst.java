package com.learn.tree;

public class LargestNumberInBst {
	public static void main(String[] args) {
        Node rootNode = null;
        rootNode = addNode(rootNode, 5);
        rootNode = addNode(rootNode, 2);
        rootNode = addNode(rootNode, 12);
        rootNode = addNode(rootNode, 1);
        rootNode = addNode(rootNode, 3);
        rootNode = addNode(rootNode, 9);
        rootNode = addNode(rootNode, 21);
        rootNode = addNode(rootNode, 19);
        rootNode = addNode(rootNode, 25);
        
	}
	
	private static Node addNode(Node rootNode, int i){
		if (rootNode==null) {
			rootNode = new Node(i);
		} else {
			if (i>rootNode.getData()) {
				Node nodeToAdd = addNode(rootNode.getRight(), i);
				rootNode.setRight(nodeToAdd);
			} else {
                Node nodeToAdd = addNode(rootNode.getLeft(), i);
                rootNode.setLeft(nodeToAdd);
			}
		}
		return rootNode;
	}
	
	public static int findClosestValue(Node root, int n) {
		int val=-1;
		while(root!=null){
			if (root.getData()>n) {
				root=root.getLeft();
			} else {
				val=root.getData();
				root=root.getRight();
			}
		}
		return val;
	}
}
