package com.pkg.learn;

import java.util.Scanner;

public class CandidateCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		int i=0;
		while(in.hasNextInt()){
			arr[i] = in.nextInt();
			i++;
		}
		in.close();
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		System.out.println(totalCostOFAllWays(arr));
	}

	private static int totalCostOFAllWays(int[] arr) {
		long sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				sum = sum + (arr[j]*arr[i]*(j+1));
			}
		}
		return (int)sum%(1000000007);
	}

}
