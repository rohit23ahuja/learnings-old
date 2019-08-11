package com.interview.prepare;

import java.util.HashMap;
import java.util.Map;

public class DNAComplment {
	public static void main(String[] args) {
		String s = "GTCAG";
		System.out.println(dnaComplement(s));
	}

	public static String dnaComplement(String s) {
		Map<Character, Character> mapKey = new HashMap<>();
		mapKey.put('A', 'T');
		mapKey.put('T', 'A');
		mapKey.put('G', 'C');
		mapKey.put('C', 'G');
		// Write your code here

		int length = s.length();
		char[] arr = s.toCharArray();
		int mid = length / 2;
		int high = mid;
		if (length % 2 != 0) {
			arr[mid] = mapKey.get(arr[mid]);
			high++;
		}
		int low = mid - 1;
		while (high <= length - 1 && low >= 0) {
			arr[high] = mapKey.get(arr[high]);
			arr[low] = mapKey.get(arr[low]);
			char temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			high++;
			low--;
		}

		return new String(arr);
	}
}
