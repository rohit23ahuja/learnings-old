package com.learn.ds.array;

public class TwoDArrayDiagonals {
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		System.out.println("Print matrix as it is");
		printMatrix(numbers);
		System.out.println();
		System.out.println("Print diagonals");
		printDiagonals(numbers);
	}

	private static void printDiagonals(int[][] numbers) {
		int rowCount = numbers.length;
		int colCount = numbers[0].length;
		for (int r = 0; r < rowCount; r++) {
			int row = r;
			int col = 0;
			while (row >= 0 && col < colCount) {
				System.out.print(numbers[row][col]+ " \t");
				row--;
				col++;
			}
			System.out.println();
		}
		for (int c = 1; c < colCount; c++) {
			int row = rowCount-1;
			int col = c;
			while (row >= 0 && col < colCount) {
				System.out.print(numbers[row][col]+ " \t");
				row--;
				col++;
			}
			System.out.println();
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
