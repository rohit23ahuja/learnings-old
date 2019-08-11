package com.learn.pattern.flyweight.inventory;

import java.util.HashMap;
import java.util.Map;

// Catalog is flyweight factory for flyweight object Item
public class Catalog {
	private Map<String, Item> items = new HashMap<String, Item>();
	
	//factory
	public Item lookup(String itemName){
		if (!items.containsKey(itemName)) 
			items.put(itemName, new Item(itemName));
		return items.get(itemName);
	}
	
	public int totalItemsMade() {
		return items.size();
	}
}
