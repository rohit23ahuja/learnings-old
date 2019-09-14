package com.learn.algo.selectionsort;

public class App {
	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] { 23, 7, 2, 59, 96, 35, 71 });
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minimum = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[minimum]) minimum =j;
			}
			swap(i, minimum, a);
		}
		return a;
	}

	private static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j]=temp;
	}
}
