package designpatterns.structural.bridge.shape2;

public class Circle extends Shape {
	protected Color color;
	
	public Circle(Color color) {
		this.color = color;
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}
}
