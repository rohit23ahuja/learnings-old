package com.learn.ds.graph;

public class GraphBetter3 {
	
private Vertex3[] arrayOfLists;
private int indexCounter=0;
boolean undirected = true;

public void addVertex(String vertexName) {
	arrayOfLists[indexCounter] = new Vertex3(vertexName, null);
	indexCounter++;
}
}


class Vertex3 {
	String name;
	Node1 adjList;
	
	
	public Vertex3(String name, Node1 aNode) {
		this.name = name;
		this.adjList = aNode;
	}

}

class Node1 {
	public int vertexIdx;
	public Node next;
	public Node1(int vertexIdx, Node node) {
		this.vertexIdx = vertexIdx;
		next = node;
	}
}