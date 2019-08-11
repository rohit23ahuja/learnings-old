package learn.algorithm.sorting;

public class InsertionSort {
	// 71, 56, 23, 39, 15, 91, 3, 48, 62, 87
	// 71,    56, 23, 39, 15, 91, 3, 48, 62, 87
	// 56, 71,    23, 39, 15, 91, 3, 48, 62, 87
	// 23, 56, 71,    39, 15, 91, 3, 48, 62, 87
	// 23, 39, 56, 71,   15, 91, 3, 48, 62, 87
	public static void main(String[] args) {
		int[] arr = { 71, 56, 23, 39, 15, 91, 3, 48, 62, 87};
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int hole = i;
			while(hole>0 && arr[hole-1]>value){
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole]=value;
		}
	}
}
