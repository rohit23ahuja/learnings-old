package com.learn.algo.linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 34, 23, 22, 13, 7, 88 };
		int x = 89;
		int index = linearSearch(a, x);
		System.out.println("At position : "+index);
	}

	private static int linearSearch(int[] a, int x) {
		int n = a.length;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (a[i]==x) {
				index = i;
			}
		}
		return index;
	}
}
