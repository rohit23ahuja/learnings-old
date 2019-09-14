package com.learn.ds.graph;

import com.learn.dsa.singlylinkedlist.SinglyLinkedList;

public class Vertex2 {
	private String name;
	private SinglyLinkedList adjacencies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SinglyLinkedList getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(SinglyLinkedList adjacencies) {
		this.adjacencies = adjacencies;
	}

}
