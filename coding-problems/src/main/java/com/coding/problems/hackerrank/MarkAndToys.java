package com.coding.problems.hackerrank;

public class MarkAndToys {
	public static void main(String[] args) {
		int[] arr = {1, 12, 5, 111, 200, 1000, 10};
		int k = 50;
		System.out.println(maximumToys(arr, k));
	}
	
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int p = 0;
        int r = prices.length -1;
        quickSort(prices, p , r);
        int sum = 0;
        int count = 0;
        for(int i = 0; i<prices.length; i++) {
            if(sum + prices[i] <=k) {
                sum+=prices[i];
                ++count;
            } else {
                return count;
            }
        }
        return count;
    }

    static void quickSort(int[] arr, int p, int r) {
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    static int partition(int[] arr, int p, int r) {
        int pivotValue = arr[r];
        int i = p-1;
        for(int j =p; j<r; j++){
            if(arr[j]<=pivotValue){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
