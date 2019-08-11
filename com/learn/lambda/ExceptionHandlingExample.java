package com.learn.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4 };
		int key = 0;
		process(intArray, key, (x, y) -> System.out.println(x + y));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		process(intArray, key, (x, y) -> System.out.println(x * y));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		process(intArray, key, (x, y) -> {
			try {
				System.out.println(x / y);
			} catch (ArithmeticException e) {
				System.out.println("An arithmetic exceptioin occured");
			}
			});
		
	}

	private static void process(int[] intArray, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : intArray) {
			biConsumer.accept(i, key);
		}
	}
}
