package com.pkg.learn;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {564,89,56,23,644,987,156,78,489,347,876,796,13,52};
		//  13,23,52,796,876,347,489,78,,156,987,644,56,89,564
		int pivot = arr[arr.length-1];
		System.out.println(pivot);
		int i =-1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]<=pivot) {
				i=i+1;
				swap(arr,i,j);
			}
		}
		display(arr);
	}

	private static void swap(int[] A,int i, int j) {
		int temp = A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	
	private static void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}

}
