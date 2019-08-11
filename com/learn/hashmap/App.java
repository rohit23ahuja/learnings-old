package com.learn.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("Address1", "PV1");
	map.put("Address2", "PV2");
	map.put("Address3", "PV");
	map.put("Address4", "PV");
	map.put("Address5", "PV");
	map.put("Address6", "PV");
	map.put("Address7", "PV");
	map.put("Address8", "PV");
	map.put("Address9", "PV");
	map.put("Address10", "PV");
	map.put("Address11", "PV");
	map.put("Address12", "PV");
	System.out.println(map);
	map.put("Address13", "PV");
	// Resizing and rehashing occurs during/after this insertion
	System.out.println(map);
	HashSet<String> set = new HashSet<>();
}
}
