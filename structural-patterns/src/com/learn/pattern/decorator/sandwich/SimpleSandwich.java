package com.learn.pattern.decorator.sandwich;
// Concrete Component
public class SimpleSandwich implements Sandwich {

	@Override
	public String make() {
		return "Two Slices of Bread";
	}

}
