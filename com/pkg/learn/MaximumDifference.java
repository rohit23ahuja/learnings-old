package com.pkg.learn;

public class MaximumDifference {
/*	Input : arr = {2, 3, 10, 6, 4, 8, 1}
	Output : 8
	Explanation : The maximum difference is between 10 and 2.

	Input : arr = {7, 9, 5, 6, 3, 2}
	Output : 2
	Explanation : The maximum difference is between 9 and 7.*/
	
	/*	In this method, instead of taking difference of the picked element 
	 * with every other element, we take the difference with the minimum element found so far.
	 *  So we need to keep track of 2 things:
		1) Maximum difference found so far.
		2) Minimum number visited so far.*/	
	public static void main(String[] args) {
		int[] intArray = new int[]{2, 3, 10, 6, 4, 8, 1};
		int min_element = intArray[0];
		int difference = intArray[1] - intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if(intArray[i]<min_element) min_element = intArray[i];
			if(intArray[i]-min_element>difference) difference = intArray[i]-min_element;
		}
		System.out.println(difference);
	
	}

}
