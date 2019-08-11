package com.pkg.learn;

public class SwapTwoNumber {
	public static void main(String[] args) {
int x=2;
int y =6;
System.out.println("x : "+x+", y : "+y);
x = x+y;
y = x-y;
x=x-y;
System.out.println("x : "+x+", y : "+y);
	}
}
