package com.learn.pattern.decorator.sandwich;

public class DecoratorSandwichDemo {

	public static void main(String[] args) {
		//Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		Sandwich sandwich = new DressingDecorator(new PaneerDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}

}
