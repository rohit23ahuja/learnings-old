package designpatterns.structural.decorator.sandwich;

public class MeatDecorator extends SandwichDecorator {
	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();
	}

	public String addMeat() {
		return " + Meat Salami";
	}
}
