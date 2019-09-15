package com.hackerrank.solutions;

public class App {
	public static void main(String[] args) {
		A a = new A();
		a.printValue();
	}
}

class A {
	int k;
	boolean istrue;
	static int p;

	public void printValue() {
		System.out.print(k);
		System.out.print(istrue);
		System.out.print(p);
	}
}
