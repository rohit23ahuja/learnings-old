package arrays;

public class ArraysRotation {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {4,5,6,7,1,2,3};
		System.out.println(isRotation(arr1, arr2));
	}

	private static boolean isRotation(int[] arr1, int[] arr2) {
		if(arr1.length!=arr2.length) return false;
		int key = arr1[0];
		int indexKeyInArr2 = -1;
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]==key) indexKeyInArr2 = i;
		}
		if(indexKeyInArr2==-1) return false;
		for (int i = 0; i < arr1.length; i++) {
			int j = (indexKeyInArr2+i)%arr2.length;
			if(arr1[i]!=arr2[j]) return false;
		}
		return true;
	}

}
