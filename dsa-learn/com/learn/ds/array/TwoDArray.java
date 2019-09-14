package com.learn.ds.array;

public class TwoDArray {
public static void main(String[] args) {
	int[][] numbers = new int[6][6];
	numbers[0][0]=13;
	numbers[0][1]=22;
	numbers[0][2]=23;
	numbers[1][0]=7;
	numbers[1][1]=12;
	numbers[1][2]=2;
	numbers[2][0]=10;
	numbers[2][1]=56;
	numbers[2][2]=59;
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if(i==j) System.out.print(numbers[i][j]+"\t");
		}
		System.out.println("\n");
	}
}	
}
