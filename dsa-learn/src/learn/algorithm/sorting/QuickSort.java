package learn.algorithm.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {567,8, 23, 346, 8, 21, 987, 46, 2, 74, 35};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void quickSort(int[] arr, int p, int r) {
		if (p<r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);			
		}
	}

	private static int partition(int[] arr, int p, int r) {
		int pivotValue = arr[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (arr[j]<=pivotValue) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
