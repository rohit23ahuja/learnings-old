package com.learn.ds.graph;

import com.learn.dsa.singlylinkedlist.SinglyLinkedList;

public class GraphBetter2 {
	private int vCount;
	private int eCount;
	private Vertex2[] vertexes;

	public GraphBetter2(int count) {
		vCount = 0;
		eCount = 0;
		vertexes = new Vertex2[count];
	}

	public void addVertex(String src) {
		Vertex2 vertex = new Vertex2();
		vertex.setName(src);
		SinglyLinkedList list = new SinglyLinkedList();
		vertex.setAdjacencies(list);
		if (vCount<vertexes.length) {
			vertexes[vCount] = vertex;
			vCount++;
		}
	}
	
	public void addEdge(String src, String dest) {
		for (int i = 0; i < vertexes.length; i++) {
			if (vertexes[i].getName().equals(src)) {
				vertexes[i].getAdjacencies().insertFirst(getIndex(dest));
			}
		}
	}
	
	public int getIndex(String s) {
		for (int i = 0; i < vertexes.length; i++) {
			if (vertexes[i].getName().equals(s)) {
				return i;
			}
		}
		return 0;
	}
	
}
