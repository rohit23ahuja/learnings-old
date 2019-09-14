package com.learn.dsa.linkedlist;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.setData(4);
		
		Node nodeB = new Node();
		nodeB.setData(3);
		nodeA.setNext(nodeB);
		
		Node nodeC = new Node();
		nodeC.setData(7);
		nodeB.setNext(nodeC);
		
		Node nodeD = new Node();
		nodeD.setData(8);
		nodeC.setNext(nodeD);
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
	}

	private static int listLength(Node node) {
		int length =0;
		while(node!=null) {
			length++;
			node=node.getNext();
		}
		return length;
	}

}
