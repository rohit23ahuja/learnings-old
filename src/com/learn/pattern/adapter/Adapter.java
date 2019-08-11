package com.learn.pattern.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {
	public static void main(String[] args) {
		Integer[] arrayOfInts = { 23, 30, 44, 56 };
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}
}
