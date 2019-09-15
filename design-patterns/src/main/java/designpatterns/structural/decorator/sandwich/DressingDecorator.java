package designpatterns.structural.decorator.sandwich;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	public String make() {
		return customSandwich.make() + addDressing();
	}

	public String addDressing() {
		return " + Lettuce + Cheese Chilli Sauce";
	}

}
