package com.learn.ds.graph;

import com.learn.dsa.singlylinkedlist.SinglyLinkedList;

public class GraphWithLinkedList {
	private int vCount;
	private int eCount;
	private SinglyLinkedList[] items;

	public GraphWithLinkedList(int vertex) {
		vCount = vertex;
		eCount =0;
		items = new SinglyLinkedList[vCount];
		for (int i = 0; i < items.length; i++) {
			items[i] = new SinglyLinkedList();
		}
	}
	
	public int getVCount() {
		return vCount;
	}
	
	public int getECount() {
		return eCount;
	}
	
	public void addEdge(int src, int dest) {
		items[src].insertFirst(dest);
		eCount++;
	}
	
	public SinglyLinkedList adjacents(int src) {
		return items[src];
	}
}
