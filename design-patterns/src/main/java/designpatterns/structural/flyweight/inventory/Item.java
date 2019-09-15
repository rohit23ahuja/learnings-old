package designpatterns.structural.flyweight.inventory;

// Instances of Item class will be fly weights. 
// Item object is immutable. no setters for name, can only be set through constructor. can have getter.
// item has intrinsic attribute name
public class Item {
	private final String name;

	public Item(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
