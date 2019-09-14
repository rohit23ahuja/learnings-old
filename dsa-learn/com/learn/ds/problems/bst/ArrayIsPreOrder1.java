package com.learn.ds.problems.bst;

public class ArrayIsPreOrder1 {

	static int[] A = { 103, 82, 77, 36, 93, 156, 137, 233, 254 };

	public static void main(String[] args) {
		System.out.println(isBst(A, 0, A.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private static boolean isBst(int[] A, int start, int end, int minValue, int maxValue) {
		if (start >= end) {
			return true;
		}
		int root = A[start];
		int maxIndex = start;
		for (int i = start; i <= end; i++) {
			if (A[i] < minValue || A[i] > maxValue)
				return false;
			if (A[i] > root) {
				break;
			}
			maxIndex++;
		}
		boolean left = isBst(A, start + 1, maxIndex - 1, minValue, A[start] - 1);
		boolean right = isBst(A, maxIndex, end, A[start] + 1, maxValue);
		return left && right;
	}
}
