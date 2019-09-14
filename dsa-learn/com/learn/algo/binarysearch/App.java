package com.learn.algo.binarysearch;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] a = { 45, 23, 22, 7, 9, 13, 56, 59, 88, 34, 28 };
		Arrays.sort(a);
		int x = 23;
		System.out.println("Item is at : " + binarySearch(a, x));
	}

	private static int binarySearch(int[] a, int x) {
		int p = 0;
		int r = a.length - 1;
		int q = 0;
		while (p <= r) {
			q = (p + r) / 2;
			if (a[q] > x) r = q - 1;
			else if (a[q] < x) p = q + 1;
			else return q;
		}
		return -1;
	}

}
