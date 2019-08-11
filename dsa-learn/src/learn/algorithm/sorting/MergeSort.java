package learn.algorithm.sorting;

public class MergeSort {
	// 00, 01, 02, 03, 04, 05, 6, 07
	// 97, 34, 58, 72, 64, 10, 6, 29

	public static void main(String[] args) {
		int[] arr = { 97, 34, 58, 72, 64, 10, 6, 29, 81};
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void mergeSort(int[] arr) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int[] leftArray = new int[mid];
		// for even number length of array we can both arrays of length mid. but
		// for odd numbers we need to have one array as length mid and other as
		// n-mid.
		int[] rightArray = new int[n - mid];

		// to fill left array
		for (int i = 0; i < mid; i++) {
			leftArray[i] = arr[i];
		}

		// to fill right array
		for (int i = mid; i < n; i++) {
			rightArray[i - mid] = arr[i];
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, arr);
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		int i=0,j=0,k=0;
		
		// pick one element each from left and right sub array. Insert the smaller one in the third array. Increment counter 
		while(i<leftLength&&j<rightLength){
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			} else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		//left over elements from left array
		while(i<leftLength){
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		
		//left over elements from right array
		while(j<rightLength){
			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}
}
