package com.hackerrank.solutions;

public class AlternateCharacters {

	public static void main(String[] args) {
		String s = "AAABBB";
		
		System.out.println(alternatingCharacters(s));
	}

    static int alternatingCharacters(String s) {
    	int count = 0;
    	char[] arr = s.toCharArray();
    	count += alternatingCharacters(arr, 0, count);
    	return count;
    }

	private static int alternatingCharacters(char[] arr, int i, int count) {
		if(arr.length == i+1) return count;
		if(arr[i]!=arr[i+1]) {
			return alternatingCharacters(arr, i+1, count);
		} else {
			return alternatingCharacters(arr, i+1, ++count);	
		}
	}
}
