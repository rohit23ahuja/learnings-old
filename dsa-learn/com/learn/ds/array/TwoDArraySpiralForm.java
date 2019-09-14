package com.learn.ds.array;

public class TwoDArraySpiralForm {
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		System.out.println("Print Matrix");
		printMatrix(numbers);
		System.out.println("Print Matrix in spiral form");
		printSpiralForm(numbers);
	}

	private static void printSpiralForm(int[][] numbers) {
		int rowStart = 0;
		int rowEnd = numbers.length - 1;
		int colStart = 0;
		int colEnd = numbers[0].length - 1;
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = rowStart; i <= colEnd; i++) {
				System.out.print(numbers[rowStart][i]+" ");
			}
			for (int j = rowStart+1; j <= rowEnd; j++) {
				System.out.print(numbers[j][colEnd]+" ");
			}
			if(rowStart+1<=rowEnd){
				for (int k = colEnd-1; k >= colStart; k++) {
					System.out.print(numbers[rowEnd][k]+" ");
				}
			}
			if (colStart+1<=colEnd) {
				for (int k = rowEnd-1; k > rowStart; k++) {
					System.out.print(numbers[k][colStart]+" ");
				}
			}
			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
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
