package com.learn.ds.graph;

public class GraphBetter {
	private int vCount;
	private int eCount;
	private Vertex[] vertexes;
	private boolean directed;

	public GraphBetter(int vertex, String directional) {
		vCount = 0;
		eCount = 0;
		vertexes = new Vertex[vertex];
		if (directional.equals("directed")) {
			directed = true;
		}
	}

	public int vCount() {
		return vCount;
	}

	public int eCount() {
		return eCount;
	}

	public void addVertex(String s) {
		if (vCount < vertexes.length) {
			Vertex vertex = new Vertex();
			vertex.setKey(s);
			vertex.setAdjacencies(new SinglyLinkedList());
			vertexes[vCount] = vertex;
			vCount++;
		} else {
			throw new IllegalStateException();
		}
	}

	public void addEdge(String src, String dest) {
		for (int i = 0; i < vertexes.length; i++) {
			Vertex vertex = vertexes[i];
			if (vertex.getKey().equals(src)) {
				vertex.getAdjacencies().insertLast(dest);
				eCount++;
			}
			if (!directed && vertex.getKey().equals(dest)) {
				vertex.getAdjacencies().insertLast(src);
				eCount++;
			}
		}
	}

	public void print() {
		for (int i = 0; i < vertexes.length; i++) {
			System.out.print(vertexes[i].getKey());
			vertexes[i].getAdjacencies().display();;
			
		}
	}
}
