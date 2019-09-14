package com.learn.ds.graph;

import java.util.ArrayList;

public class Graph {
	private int vCount;
	private int eCount;
	private ArrayList<Integer>[] adjacents;
	
	@SuppressWarnings("unchecked")
	public Graph(int vertex) {
		vCount = vertex;
		eCount = 0;
		adjacents = new ArrayList[vertex];
		for (int i = 0; i < adjacents.length; i++) {
			adjacents[i] = new ArrayList<Integer>(vertex);
		}
	}
	
	public int getVertexCount() {
		return vCount;
	}
	
	public int getEdgecount() {
		return eCount;
	}
	
	public void addEdge(int src, int dest) {
		adjacents[src].add(dest);
		eCount++;
	}
	
	public ArrayList<Integer> adjacents(int src){
		return adjacents[src];
	}
}
