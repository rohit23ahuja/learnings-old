package com.learn.pattern.decorator.sandwich;

public class PaneerDecorator extends SandwichDecorator{

	public PaneerDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return customSandwich.make() + addPaneer();
	}
	
	public String addPaneer() {
		return " + Paneer ";
	}

}
