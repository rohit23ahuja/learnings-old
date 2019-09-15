package designpatterns.structural.flyweight.inventory;

// consumer of our Flyweight object - Item.
// this is extrinsic object because each order in unique iwht order number.
public class Order {
	private final int orderNumber;
	private final Item item;

	Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}
	
	void processOrder() {
		System.out.println("Ordering "+item+" for order number "+orderNumber);
	}
}
