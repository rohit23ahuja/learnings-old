package com.learn.ds.problems.bst;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(62);
		bst.insert(33);
		bst.insert(87);
		bst.insert(76);
		bst.insert(93);
		bst.insert(89);
		bst.insert(107);
		bst.insert(24);
		bst.insert(44);
		bst.insert(12);
		bst.insert(27);
		bst.insert(37);
		bst.insert(53);
		// bst.traverse();
		// levelOrderTraversalSameLine(bst.getRoot());
		levelOrderTraversalLineByLine(bst.getRoot());
	}

	private static void levelOrderTraversalLineByLine(Node node) {
		if (node != null) {
			Queue<Node> queue = new Queue<Node>(50);
			queue.insert(node);
			queue.insert(null);
			levelOrderTraversalLineByLine(queue);
		}
	}

	private static void levelOrderTraversalLineByLine(Queue<Node> queue) {
		if (queue.peekFront()==null&&queue.peekRear()==null)
			return;
		Node node = queue.remove();
		if (node != null) {
			System.out.print(node.getData()+" ");
			if (node.getLeft() != null)
				queue.insert(node.getLeft());
			if (node.getRight() != null)
				queue.insert(node.getRight());
		} else {
			System.out.println(" ");
			queue.insert(null);
		}
		levelOrderTraversalLineByLine(queue);
	}

	private static void levelOrderTraversalSameLine(Node node) {
		Queue<Node> queue = new Queue<Node>(20);
		if (node != null) {
			queue.insert(node);
			levelOrderTraversalSameLine(queue);
		}
	}

	private static void levelOrderTraversalSameLine(Queue<Node> queue) {
		if (queue.isEmpty()) {
			return;
		}
		Node node = queue.remove();
		System.out.print(node.getData() + " ");
		if (node.getLeft() != null)
			queue.insert(node.getLeft());
		if (node.getRight() != null)
			queue.insert(node.getRight());
		levelOrderTraversalSameLine(queue);
	}
}
