package com.learn.ds.graph;

public class Vertex {
	private String key;
	private SinglyLinkedList adjacencies;
	public void setKey(String s) {
		key = s;
	}
	public void setAdjacencies(SinglyLinkedList singlyLinkedList) {
			adjacencies = singlyLinkedList;
	}
	public String getKey() {
		return key;
	}
	public SinglyLinkedList getAdjacencies() {
		return adjacencies;
	}

}
