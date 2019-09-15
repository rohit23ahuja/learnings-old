package eleven.essentials.solutions.twod.arrays;

public class Rotate2dArrayInPlace {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("================");
		rotateInPlace(arr,3);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void rotateInPlace(int[][] arr, int n) {
		for (int i = 0; i < Math.ceil(n/2); i++) {
			for (int j = 0; j < Math.floor(n/2); j++) {
				int[] temp = {-1, -1, -1, -1};
				int current_i = i;
				int current_j = j;
				for (int k = 0; k < temp.length; k++) {
					temp[k] = arr[current_i][current_j];
					int tmp = current_i;
					current_i=current_j;
					current_j=n-1-tmp;
				}
				for (int k = 0; k < temp.length; k++) {
					arr[current_i][current_j]=temp[(k+n)%temp.length];
					int tmp = current_i;
					current_i=current_j;
					current_j=n-1-tmp;
				}
			}
		}
	}
}
