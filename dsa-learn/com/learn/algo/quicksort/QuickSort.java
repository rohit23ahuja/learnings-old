package com.learn.algo.quicksort;

public class QuickSort {
	private static int[] intArray = { 756, 44, 602, 148, 491, 137, 14, 233, 117, 13, 45, 5, 602, 148 };

	public static void main(String[] args) {
		display();
		quickSort(intArray, 0, intArray.length - 1);
		display();
	}

	private static void quickSort(int[] intArray, int p, int r) {
		if (p < r) {
			int q = partition(intArray, p, r);
			quickSort(intArray, p, q - 1);
			quickSort(intArray, q + 1, r);
		}
	}

	private static int partition(int[] intArray, int p, int r) {
		int pivot = intArray[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (intArray[j] <= pivot) {
				i++;
				swap(intArray, i, j);
			}
		}
		swap(intArray, i + 1, r);
		return i + 1;
	}

	private static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	private static void display() {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

}
