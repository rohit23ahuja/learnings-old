package com.learn.pattern.decorator.sandwich;
// Base Decorator - it implements Component
public abstract class SandwichDecorator implements Sandwich {
	protected Sandwich customSandwich;
	
	public SandwichDecorator(Sandwich sandwich){
		this.customSandwich = sandwich;
	}
	
	public String make() {
		return customSandwich.make();
	}

}
