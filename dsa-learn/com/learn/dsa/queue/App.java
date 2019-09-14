package com.learn.dsa.queue;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] digits = { 6, 0, 8, 7, 1 };
		Arrays.sort(digits);
		QueueOfIntegers queue0 = new QueueOfIntegers(5);
		QueueOfIntegers queue1 = new QueueOfIntegers(5);
		QueueOfIntegers queue2 = new QueueOfIntegers(5);
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum = sum + digits[i];
			if (digits[i] % 3 == 0) {
				queue0.insert(digits[i]);
			}
			if (digits[i] % 3 == 1) {
				queue1.insert(digits[i]);
			}
			if (digits[i] % 3 == 2) {
				queue2.insert(digits[i]);
			}
		}
		System.out.println("Queue 0");
		queue0.view();
		System.out.println("Queue 1");
		queue1.view();
		System.out.println("Queue 2");
		queue2.view();
		
		if (sum % 3 == 1) {
			if (!queue1.isEmpty())
				queue1.remove();
		}
		if(sum%3==2){
			if(!queue2.isEmpty()){
				queue2.remove();
			}
		}
		int i =0;
		digits = new int[queue0.getSize()+queue1.getSize()+queue2.getSize()];
		while(!queue0.isEmpty()){
			digits[i++] = queue0.remove();
		}
		while(!queue1.isEmpty()){
			digits[i++] = queue1.remove();
		}
		while(!queue2.isEmpty()){
			digits[i++] = queue2.remove();
		}
		Arrays.sort(digits);
		System.out.println("Largest multiple of 3 ");
		for (int j = digits.length-1; j >= 0; j--) {
			System.out.print(digits[j]);
		}
	}

}
