package eleven.essentials.solutions.arrays;

public class SearchInSortedArray {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 10, 12, 15, 20, 25, 31, 40 };
		System.out.println(findElementInSortedArray(arr, 20));
	}

	private static boolean findElementInSortedArray(int[] arr, int value) {
		if(findElementInSortedArray(arr, 0, arr.length, value)==-1) {
			return false;
		} else {
			return true;
		}
	}

	private static int findElementInSortedArray(int[] arr, int p, int r, int value) {
		if(p>r) return -1;
		int q = (p+r)/2;
		if(arr[q]==value) return q;
		else if (arr[q]>value) return findElementInSortedArray(arr, p, q-1, value);
		else return findElementInSortedArray(arr, q+1, r, value);
	}
}
