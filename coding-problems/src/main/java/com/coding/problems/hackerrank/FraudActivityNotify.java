package com.coding.problems.hackerrank;

public class FraudActivityNotify {

	public static void main(String[] args) {
		//int[] arr = {2, 3, 4, 2, 3, 6, 8, 4, 5 };
		// 2, 2, 3, 3, 4, 4, 5, 6, 8
		int[] arr = {1, 2, 3, 4, 4};
		int d = 4;
		int p =0;
		float median = 0;
		int notifications = 0;
		for(int i=1; i<arr.length; i++){
			int value = arr[i];
			if(i>=d){
				int mid = (i-1-p)/2 +p;
				if(d%2==0) {
					median = (float) (arr[mid]+arr[mid+1])/2;
				} else {
					median = arr[mid];
				}
				if (arr[i]>=2*median) {
					notifications++;
				}
				p++;
			}
			int hole = i;
			while(hole>0&&arr[hole-1]>value){
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole]=value;
		}
		System.out.println("Notifications "+notifications);
		
		
	/*	int p =0;
		insertionSort(arr, p+1, d);
		int median = 0;
		int notifications = 0;
		for(int i=0; i<arr.length; i++) {
			if(i>=d) {
	
				int mid = ((i-p)/2) +p;
				if(d/2==0) {
					median = (arr[mid]+arr[mid+1])/2;
				} else {
					median = arr[mid];
				}
				if (arr[i]>=2*median) {
					notifications++;
				}
				p++;
			}
		}
		System.out.println("Notifications "+notifications);
		insertionSort(arr, 1, 5);
		mergeSort(arr);*/
	}

	private static void insertionSort(int[] arr, int p, int r) {
		for(int i =p; i< r; i++) {
			int value = arr[i];
			int hole = i;
			while(hole>0&&arr[hole-1]>value) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = value;
		}
		
	}

	private static void mergeSort(int[] arr) {
		int n = arr.length;
		if(n<2) return;
		int mid = n/2;
		
		int leftArrayLength = mid;
		int rightArrayLength = n-mid;
		
		int[] leftArray = new int[leftArrayLength];
		for(int i=0; i<mid; i++) {
			leftArray[i] = arr[i];
		}
		
		int[] rightArray = new int[rightArrayLength];
		for(int i=mid; i<n;i++) {
			rightArray[i-mid] = arr[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, arr);
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
		int i=0, j=0, k=0;
		int leftArrayLength = leftArray.length;
		int rightArrayLength = rightArray.length;
		
		while(i<leftArrayLength&&j<rightArrayLength){
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArrayLength) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArrayLength) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	

}
