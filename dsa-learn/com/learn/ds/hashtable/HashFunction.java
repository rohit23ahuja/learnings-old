package com.learn.ds.hashtable;

import java.util.Arrays;

public class HashFunction {
	String[] hashArray;
	int arraySize;
	int itemsInArray = 0;

	public static void main(String[] args) {
		HashFunction hashFunction = new HashFunction(12);
		hashFunction.displayTheArray();
		String[] toInsert = {"11", "4", "9"};
		hashFunction.hashFunction1(toInsert);
		hashFunction.displayTheArray();
	}

	private void hashFunction1(String[] toInsert) {
		for (int i = 0; i < toInsert.length; i++) {
			hashArray[Integer.parseInt(toInsert[i])] = toInsert[i]; 
		}
	}

	public HashFunction(int size) {
		arraySize=size;
		hashArray = new String[size];
		Arrays.fill(hashArray, "-1");
	}
	
	public void displayTheArray() {
		for (int i = 0; i < hashArray.length; i++) {
			System.out.print("[ ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.print(hashArray[i]);
			System.out.print("] ");
		}
	}
}
