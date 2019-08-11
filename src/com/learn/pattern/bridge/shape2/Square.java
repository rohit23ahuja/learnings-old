package com.learn.pattern.bridge.shape2;

public class Square extends Shape {
	protected Color color;

	public Square(Color color) {
		this.color = color;
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
