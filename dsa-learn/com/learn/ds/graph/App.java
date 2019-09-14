package com.learn.ds.graph;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import com.learn.dsa.singlylinkedlist.SinglyLinkedList;

public class App {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		graph.addEdge(4, 0);
		graph.addEdge(4, 3);

		ArrayList<Integer> adj = graph.adjacents(0);
//		for (Integer integer : adj) {
//			System.out.println(integer);
//		}
		GraphWithLinkedList graphWithLinkedList = new GraphWithLinkedList(5);
		graphWithLinkedList.addEdge(0, 1);
		graphWithLinkedList.addEdge(0, 2);
		graphWithLinkedList.addEdge(0, 3);
		graphWithLinkedList.addEdge(1, 2);
		graphWithLinkedList.addEdge(1, 4);
		graphWithLinkedList.addEdge(2, 3);
		graphWithLinkedList.addEdge(3, 1);
		graphWithLinkedList.addEdge(4, 0);
		graphWithLinkedList.addEdge(4, 3);
		
		SinglyLinkedList sll = graphWithLinkedList.adjacents(1);
		//sll.displayList();
		
		
		GraphBetter betterGraph = new GraphBetter(5, "directed");
		betterGraph.addVertex("State");
		betterGraph.addVertex("Avenel");
		betterGraph.addVertex("Pocono");
		betterGraph.addVertex("Elm");
		betterGraph.addVertex("William");
		
		betterGraph.addEdge("State", "Avenel");
		betterGraph.addEdge("State", "Elm");
		betterGraph.addEdge("Avenel", "Pocono");
		betterGraph.addEdge("Pocono", "Elm");
		betterGraph.addEdge("Elm", "Avenel");
		betterGraph.addEdge("Elm", "William");
		betterGraph.addEdge("William", "Pocono");
		betterGraph.addEdge("William", "State");
		
		//betterGraph.print();
		
		
		BetterGraphImtiaz myGraph = new BetterGraphImtiaz(5, "directed");
		myGraph.addVertex("Pitampura");
		myGraph.addVertex("Prashant Vihar");
		myGraph.addVertex("Punjabi Bagh");
		myGraph.addVertex("Dhaula Kuan");
		myGraph.addVertex("Gurgaon");
		
		myGraph.addEdge("Prashant Vihar", "Pitampura");
		myGraph.addEdge("Pitampura", "Dhaula Kuan");
		myGraph.addEdge("Pitampura", "Gurgaon");
		myGraph.addEdge("Pitampura", "Punjabi Bagh");
		myGraph.addEdge("Dhaula Kuan", "Gurgaon");
		myGraph.addEdge("Punjabi Bagh", "Dhaula Kuan");
		myGraph.print();
		
		
		BetterGraphImtiaz betterGraphI = new BetterGraphImtiaz(5, "directed");
		betterGraphI.addVertex("State");
		betterGraphI.addVertex("Avenel");
		betterGraphI.addVertex("Pocono");
		betterGraphI.addVertex("Elm");
		betterGraphI.addVertex("William");
		
		betterGraphI.addEdge("State", "Avenel");
		betterGraphI.addEdge("State", "Elm");
		betterGraphI.addEdge("Avenel", "Pocono");
		betterGraphI.addEdge("Pocono", "Elm");
		betterGraphI.addEdge("Elm", "Avenel");
		betterGraphI.addEdge("Elm", "William");
		betterGraphI.addEdge("William", "Pocono");
		betterGraphI.addEdge("William", "State");

		//betterGraphI.print(); 
	}
}
