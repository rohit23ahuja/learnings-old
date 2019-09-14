package com.learn.ds.array;

public class TwoDArrayTransposeInplace {
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		System.out.println("Print Matrix");
		printMatrix(numbers);
		System.out.println();
		System.out.println("Print Transpose of Matrix in place");
		transposeMatrix(numbers);
		printMatrix(numbers);
	}

	private static void transposeMatrix(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers[0].length; j++) {
				System.out.println("Before Swap numbers["+i+"]["+j+"] "+numbers[i][j]+" numbers["+j+"]["+i+"] "+numbers[j][i]);
				if (i!=j) {
					numbers[i][j]=numbers[i][j]+numbers[j][i];
					numbers[j][i]=numbers[i][j]-numbers[j][i];
					numbers[i][j]=numbers[i][j]-numbers[j][i];		
				}
				System.out.println("After Swap numbers["+i+"]["+j+"] "+numbers[i][j]+" numbers["+j+"]["+i+"] "+numbers[j][i]);
				System.out.println();
			}
		}
	}

	private static void printMatrix(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.print(numbers[i][j] + "[" + i + "," + j + "]" + "\t");
			}
			System.out.println();
		}
	}
}
