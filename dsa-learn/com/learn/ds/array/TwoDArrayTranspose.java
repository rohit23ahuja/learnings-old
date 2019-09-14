package com.learn.ds.array;

public class TwoDArrayTranspose {
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int[][] numbersTransposed = new int[numbers[0].length][numbers.length];
		System.out.println("Print Matrix");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.print(numbers[i][j] + "[" + i + "," + j + "]" + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbersTransposed[j][i] = numbers[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Print Transpose of Matrix");
		for (int i = 0; i < numbersTransposed.length; i++) {
			for (int j = 0; j < numbersTransposed[0].length; j++) {
				System.out.print(numbersTransposed[i][j] + "[" + i + "," + j + "]" + "\t");
			}
			System.out.println();
		}

	}
}
