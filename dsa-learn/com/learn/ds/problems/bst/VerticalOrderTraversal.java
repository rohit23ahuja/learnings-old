package com.learn.ds.problems.bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class VerticalOrderTraversal {
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
		verticalOrderTraversal(bst.getRoot());
	}

	private static void verticalOrderTraversal(Node node) {
		if (node!=null) {
			Queue<VerticalOrderNode> queue = new Queue<VerticalOrderNode>(20);
			HashMap<Integer, List<VerticalOrderNode>> map = new LinkedHashMap<Integer, List<VerticalOrderNode>>();
			VerticalOrderNode verticalOrderNode = new VerticalOrderNode();
			verticalOrderNode.setData(node.getData());
			verticalOrderNode.setLeft(node.getLeft());
			verticalOrderNode.setRight(node.getRight());
			verticalOrderNode.setHd(0);
			queue.insert(verticalOrderNode);
			List<VerticalOrderNode> nodes = new LinkedList<VerticalOrderNode>();
			nodes.add(verticalOrderNode);
			map.put(0, nodes);
			verticalOrderTraversal(queue, map);
			for (Entry<Integer, List<VerticalOrderNode>> entry : map.entrySet()) {
				List<VerticalOrderNode> list = entry.getValue();
				System.out.println(list.get(list.size()-1));
			}
		}
		
	}

	private static void verticalOrderTraversal(Queue<VerticalOrderNode> queue,
			HashMap<Integer, List<VerticalOrderNode>> map) {
		if(queue.isEmpty()) return;
		VerticalOrderNode verticalOrderNode = queue.remove();
		if (verticalOrderNode.getLeft()!=null) {
			VerticalOrderNode left = new VerticalOrderNode();
			left.setData(verticalOrderNode.getLeft().getData());
			left.setRight(verticalOrderNode.getLeft().getRight());
			left.setLeft(verticalOrderNode.getLeft().getLeft());
			Integer hd = verticalOrderNode.getHd()-1;
			left.setHd(hd);
			queue.insert(left);
			if (map.containsKey(hd)) {
				List<VerticalOrderNode> list = map.get(hd);
				list.add(left);
			} else {
				List<VerticalOrderNode> list = new ArrayList<VerticalOrderNode>();
				list.add(left);
				map.put(hd, list);
			}
		}
		
		if (verticalOrderNode.getRight()!=null) {
			VerticalOrderNode right = new VerticalOrderNode();
			right.setData(verticalOrderNode.getRight().getData());
			right.setRight(verticalOrderNode.getRight().getRight());
			right.setLeft(verticalOrderNode.getRight().getLeft());
			Integer hd = verticalOrderNode.getHd()+1;
			right.setHd(hd);
			queue.insert(right);
			if (map.containsKey(hd)) {
				List<VerticalOrderNode> list = map.get(hd);
				list.add(right);
			} else {
				List<VerticalOrderNode> list = new ArrayList<VerticalOrderNode>();
				list.add(right);
				map.put(hd, list);
			}
		}
		verticalOrderTraversal(queue, map);
	}
}
