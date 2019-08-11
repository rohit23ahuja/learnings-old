package com.learn.method.override;

public class Dog extends Animal {
	
	public String walk(String s) throws ArithmeticException  {
		return "I run, i dont walk";
	}
	
	@Override
	protected Integer method1(Number n1) {
		return 1;
	}

}
