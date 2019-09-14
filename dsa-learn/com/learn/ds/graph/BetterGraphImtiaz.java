package com.learn.ds.graph;

public class BetterGraphImtiaz {
	private int indexCounter;
	private VertexImtiaz[] arrayOfVertex;
	private boolean undirected;
	
	public BetterGraphImtiaz(int size, String type) {
		arrayOfVertex = new VertexImtiaz[size];
		indexCounter = 0;
		if (type.equals("undirected")) {
			undirected = true;
		}
	}
	
	public void addVertex(String name) {
		arrayOfVertex[indexCounter] = new VertexImtiaz(name, null);
		indexCounter++;
	}
	
	public void addEdge(String source, String destination) {
		int sourceIndex = getIndexFromName(source);
		int destinationIndex = getIndexFromName(destination);
		arrayOfVertex[sourceIndex].adjList = new NodeImtiaz(destinationIndex, arrayOfVertex[sourceIndex].adjList);
		if (undirected) {
			arrayOfVertex[destinationIndex].adjList = new NodeImtiaz(sourceIndex, arrayOfVertex[destinationIndex].adjList);
		}
	}

	private int getIndexFromName(String source) {
		for (int i = 0; i < arrayOfVertex.length; i++) {
			if (arrayOfVertex[i].name.equals(source)) {
				return i;
			}	
		}
		return -1;
	}
	
	public void print() {
		for (int i = 0; i < arrayOfVertex.length; i++) {
			System.out.print(arrayOfVertex[i].name);
			NodeImtiaz temp = arrayOfVertex[i].adjList;
			while (temp!=null) {
				System.out.print(" --> "+arrayOfVertex[temp.vertexIdx].name);
				temp = temp.next;
			}
			System.out.println("\n");
		}
	}
}

class VertexImtiaz {
	String name;
	NodeImtiaz adjList;

	VertexImtiaz(String name, NodeImtiaz adjList) {
		this.name = name;
		this.adjList = adjList;
	}
}

class NodeImtiaz {
	int vertexIdx;
	NodeImtiaz next;

	public NodeImtiaz(int index, NodeImtiaz next) {
		this.vertexIdx = index;
		this.next = next;
	}
}