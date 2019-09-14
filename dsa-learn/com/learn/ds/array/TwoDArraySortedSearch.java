package com.learn.ds.array;

public class TwoDArraySortedSearch {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int toSearch = 14;
		boolean isFound=false;
		int col = arr[0].length-1;
		int row =0;
		while(row<arr.length&&col>=0){
			if(arr[row][col]==toSearch){
				isFound=true;
				break;
			} else if (toSearch>arr[row][col]){
				row++;
			} else {
				col--;
			}
		}
		
		System.out.println(isFound);
	}
}
