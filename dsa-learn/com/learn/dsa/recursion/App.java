package com.learn.dsa.recursion;

public class App {
	public static void main(String[] args) {
		// reduceByOne(31);
		int[] a = { 7, 13, 22, 23, 56, 59, 88, 92, 97 };
		// System.out.println(recursiveLinerSearch(a, 0, 93));
		// System.out.println(recursiveBinarySearch(a, 0, a.length-1, 103));;
		App app = new App();
		System.out.println(app.printFibonacciThroughRecursion(9));
	}

	private static void reduceByOne(int i) {
		if (i >= 23) {
			reduceByOne(i - 1);
		}
		System.out.println("Completed Call : " + i);
	}

	private static int recursiveLinerSearch(int[] a, int i, int x) {
		if (i > a.length - 1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			return recursiveLinerSearch(a, i + 1, x);
		}
	}

	private static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		System.out.println(p + "..." + r);
		if (p > r)
			return -1;
		else {
			int q = (p + r) / 2;
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				System.out.println("Index at :" + q);
				return recursiveBinarySearch(a, p, q - 1, x);
			} else {
				System.out.println("Index at :" + q);
				return recursiveBinarySearch(a, q + 1, r, x);
			}
		}
	}

	private void printFibonacci() {
		int i = 0;
		int counter = 0;
		System.out.print(i + " Counter: " + counter + "\n");
		int j = 1;
		counter++;
		System.out.print(j + " Counter: " + counter + "\n");
		int temp = 0;
		while (temp < 10000) {
			temp = j;
			j = i + j;
			i = temp;
			counter++;
			System.out.print(j + " Counter: " + counter + "\n");

		}
	}

	// 377
	private int printFibonacciThroughRecursion(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return printFibonacciThroughRecursion(n - 1) + printFibonacciThroughRecursion(n - 2);
	}

	private int bunnyEars(int n) {
		if (n <= 0)
			return 0;
		if (n % 2 == 0)
			return 3 + bunnyEars(n - 1);
		else
			return 2 + bunnyEars(n - 1);

	}
}
