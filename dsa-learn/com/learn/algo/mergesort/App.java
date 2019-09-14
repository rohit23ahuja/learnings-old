package com.learn.algo.mergesort;

public class App {

	public static void main(String[] args) {
		int[] a = new int[] { 0, 6, 5, 11, 5, 4, 2, 12, 9, 7, 1, 8, 3, 4, 3, 10 };
		MergeSort.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
