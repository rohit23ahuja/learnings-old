package com.learn.algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] { 23, 7, 2, 59, 96, 35, 71 });
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	private static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int element = a[i]; // element contains the data we intend to bring
								// over to the sorted area
			int j = i - 1; // last index of sorted area
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}
}
