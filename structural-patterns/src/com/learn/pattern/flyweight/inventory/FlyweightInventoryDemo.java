package com.learn.pattern.flyweight.inventory;

public class FlyweightInventoryDemo {
public static void main(String[] args) {
	InventorySystem ims = new InventorySystem();
	ims.takeOrder("Roombas", 457);
	ims.takeOrder("Samsung TV", 879);
	ims.takeOrder("Bose Headphones", 174);
	ims.takeOrder("Bose Headphones", 712);
	ims.takeOrder("Samsung TV", 783);
	ims.takeOrder("Roombas", 123);
	ims.takeOrder("Bose Headphones", 684);
	ims.takeOrder("Bose Headphones", 478);
	ims.takeOrder("Samsung TV", 321);
	ims.takeOrder("Roombas", 987);
	ims.takeOrder("Samsung TV", 369);
	ims.takeOrder("Roombas", 345);
	ims.process();
	System.out.println(ims.report());
}
}
