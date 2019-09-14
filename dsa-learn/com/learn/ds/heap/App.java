package com.learn.ds.heap;

public class App {
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(20);
		
		heap.insert(18);
		heap.insert(10);
		heap.insert(15);
		heap.insert(9);
		heap.insert(10);
		heap.insert(6);
		heap.insert(8);
		
		//heap.display();
		heap.delete();
		heap.display();
	}
}
