package two.pointer.solution;

public class QuickSortPractice {

	public static void main(String[] args) {
		Integer[] arr = {567,8, 23, 346, 8, 21, 987, 46, 2, 74, 35};
		arr = quickSort(arr, 0 , arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static Integer[] quickSort(Integer[] arr, int p, int r) {
		if(p<r){
			int q = partition(arr, p , r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
		return arr;
	}

	private static int partition(Integer[] arr, int p, int r) {
		int pivotValue = arr[r];
		int i =p-1;
		for (int j = p; j < r; j++) {
			if (arr[j]<=pivotValue) {
				i++;
				swap(arr, i,j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	private static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
