package com.hackerrank.solutions;

public class MakingAnagrams {

	public static void main(String[] args) {
		String s1 = "cde";
		String s2 = "abc";
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for(int i= 0; i<s1.length(); i++){
			count1[s1.charAt(i)-'a']++;
		}
		
		for(int i= 0; i<s2.length(); i++){
			count2[s2.charAt(i)-'a']++;
		}
		
		int result = 0;
		for (int i = 0; i < 26; i++) {
			result += Math.abs(count1[i]-count2[i]);
		}
		
		System.out.println(result);
		/*
		String s1 = "cde";
		char[] arr1 = s1.toCharArray();
		quickSort(arr1, 0 , arr1.length-1);
		

		quickSort(arr2, 0 , arr2.length-1);
		
		int i=0, j=0;
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		int count = 0;
		while(i<arr1Length && j < arr2Length) {
			if(arr1[i]!=arr2[j]) {
				count+=2;
			}
			i++;
			j++;
		}
		while(i<arr1.length) {
			i++;
			count++;
		}
		while(j<arr2.length) {
			j++;
			count++;
		}
		
		System.out.println("Count "+count);*/
	}

	private static void quickSort(char[] arr, int p, int r) {
		if(p<r){
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
	}

	private static int partition(char[] arr, int p, int r) {
		char pivotValue = arr[r];
		int i = p-1;
		for(int j = p; j<r; j++){
			if(arr[j]<=pivotValue){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
