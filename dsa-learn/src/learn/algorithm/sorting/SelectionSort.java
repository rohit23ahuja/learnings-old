package learn.algorithm.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {95, 61, 42, 27, 53, 10, 3, 79, 37};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void selectionSort(int[] arr) {

		for (int j = 0; j < arr.length; j++) {
			int temp = j;
			for (int i = j+1; i < arr.length; i++) {
				if(arr[i]<arr[temp]) {
					temp=i;
				}
			}
			swap(j,temp, arr);
		}

		
	}

	private static void swap(int j, int temp, int[] arr) {
		// TODO Auto-generated method stub
		int A = arr[j];
		arr[j] = arr[temp];
		arr[temp] = A;
	}
}
