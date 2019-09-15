package designpatterns.structural.bridge.shape2;

public class Shape2BridgeDemo {
	public static void main(String[] args) {
		Red red = new Red();
		Blue blue = new Blue();
		Shape circle = new Circle(red);
		Shape square = new Square(blue);
		
		circle.applyColor();
		square.applyColor();
	}
}
