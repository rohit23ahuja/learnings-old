package arrays;

public class CommonElementsInSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 6, 7, 9, 11 };
		int[] arr2 = { 1, 2, 4, 5, 9, 10 };
		
		int[] arr3 = new int[arr2.length];
		
		int i =0,j=0,k=0;
		
		while(j<arr2.length&&i<arr1.length) {
			if(arr2[j]==arr1[i]) {
				arr3[k] = arr2[j];
				k++;
				i++;
				j++;
			} else if(arr2[j]>arr1[i]) {
				i++;
			} else {
				j++;
			}
		}
		for (int k2 = 0; k2 < arr3.length; k2++) {
			System.out.print(arr3[k2]+" ");
		}
	}
}
