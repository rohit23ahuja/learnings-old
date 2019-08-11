package twod.arrays;

public class Rotate2dArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		int j = arr.length-1;

		int[][] arr2 = new int[arr.length][arr.length];
		while(j>=0) {
			int i = 0;
			while(i<=arr.length-1){
				arr2[i][j] = arr[arr.length-1-j][i]; 
				i++;
			}
			j--;
		}
		
		
		
		for (int k = 0; k < arr2.length; k++) {
			for (int l = 0; l < arr2[k].length; l++) {
				System.out.print(arr2[k][l]+" ");
			}
			System.out.println();
		}
	}

}
