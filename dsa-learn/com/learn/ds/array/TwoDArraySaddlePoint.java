package com.learn.ds.array;

public class TwoDArraySaddlePoint {

	public static void main(String[] args) {
		int numbers[][] = { { 10, 12, 7, 3, 12 }, { 3, 10, 6, 2, 8 }, { 18, 24, 17, 6, 10 }, { 15, 21, 10, 8, 12 },
				{ 1, 18, 22, 4, 15 } };
		System.out.println("Print Matrix");
		printMatrix(numbers);
		System.out.println();
		System.out.println("Print Saddle Points");
		printSaddlePoints(numbers);
	}

	private static void printSaddlePoints(int[][] numbers) {
		for (int row = 0; row < numbers.length; row++) {
			boolean isSaddlePointPresentInRow=true;
			int minimum = numbers[row][0];
			int minValueColIndex =0;
			
			for (int col=1; col < numbers[0].length; col++) {
				if (numbers[row][col] <minimum) {
					minimum=numbers[row][col];
					minValueColIndex=col;
				}
			}
			for (int r = 0; r < numbers.length; r++) {
				if(minimum<numbers[r][minValueColIndex]){
					isSaddlePointPresentInRow=false;
					break;
				}
			}
			
			if(isSaddlePointPresentInRow) System.out.println(minimum);
		}
		
		for (int row = 0; row < numbers.length; row++) {
			boolean isSaddlePointPresentInRow=true;
			int maximum = numbers[row][0];
			int maxValueColIndex =0;
			
			for (int col=1; col < numbers[0].length; col++) {
				if (numbers[row][col]>maximum) {
					maximum=numbers[row][col];
					maxValueColIndex=col;
				}
			}
			for (int r = 0; r < numbers.length; r++) {
				if(maximum>numbers[r][maxValueColIndex]){
					isSaddlePointPresentInRow=false;
					break;
				}
			}
			
			if(isSaddlePointPresentInRow) System.out.println(maximum);
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
