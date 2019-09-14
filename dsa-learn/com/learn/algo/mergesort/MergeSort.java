package com.learn.algo.mergesort;

public class MergeSort {
	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int start, int end) {
		if (end <= start) { // we have reached the end of array if does not
							// satisfy
			return;
		}
		int mid = (start + end) / 2;
		sort(a, start, mid); // sort left half
		sort(a, mid + 1, end); // sort right half
		merge(a, start, mid, end);

	}

	private static void merge(int[] a, int start, int mid, int end) {
		// temp array to hold the range of items passed in this method
		int[] tempArray = new int[end - start + 1];
		// start index of left array
		int leftSlot = start;
		// start index of right array
		int rightSlot = mid + 1;
		// increment it as we insert data into the array.
		int k = 0;
		// boundary condition for inserting in both array
		while (leftSlot <= mid && rightSlot <= end) {
			if (a[leftSlot] < a[rightSlot]) {
				tempArray[k] = a[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = a[rightSlot];
				rightSlot++;
			}
			k++;
		}
		// we have to take leftSlot and rightSlot to their respective end.
		//consider the right side done being sorted. Left must be sorted already
		if(leftSlot<=mid){  
			while(leftSlot<=mid){
				tempArray[k]=a[leftSlot];
				leftSlot++;
				k++;
			}
		} else if(rightSlot<=end){
			while(rightSlot<=end){
				tempArray[k]=a[rightSlot];
				rightSlot++;
				k++;				
			}
		}
		// Once the above loop is complete, both left and right side range of
		// sub array passed into this method has been sorted into the tempArray
		//Now copy over tempArray to the original array in appropriate slots.
		for (int i = 0; i < tempArray.length; i++) {
			a[start+i]=tempArray[i];
		}
	}

	private static void myMerge(int[] a, int start, int mid, int end) {
		int length = mid + 1;
		int[] arrayLeft = new int[length];
		int[] arrayRight = new int[length];
		arrayLeft[length - 1] = 99999;
		arrayRight[length - 1] = 99999;
		int i = 0;
		int j = 0;
		int x = start;
		while (x <= end) {
			if (x <= mid) {
				arrayLeft[i] = a[x];
				i++;
				x++;
			} else {
				arrayRight[j] = a[x];
				j++;
				x++;
			}
		}

		int k = 0, l = 0, m = start;
		while (k < length - 1 && l < length - 1 && m <= end) {
			if (arrayLeft[k] < arrayRight[l]) {
				a[m] = arrayLeft[k];
				k++;
				m++;
			} else {
				a[m] = arrayRight[l];
				l++;
				m++;
			}
		}
	}
}
