package com.learn.systemdesign.lrucache;

import java.util.LinkedHashMap;

public class App {

	public static void main(String[] args) {
/*		LRUCachePractice cache = new LRUCachePractice(5);
		cache.add("mercedes");
		cache.add("");*/
		
		LRUCache<String> cache = new LRUCache<>(5);
		cache.put("mercedes".hashCode(), "mercedes");
		//System.out.println(cache);
		cache.put("audi".hashCode(), "audi");
		cache.get("mercedes".hashCode());
		cache.put("bmw".hashCode(), "bmw");
		cache.put("porsche".hashCode(), "porsche");
		cache.put("volvo".hashCode(), "volvo");
		System.out.println(cache);
		cache.put("kia".hashCode(), "kia");
		System.out.println(cache);
		//LinkedHashMap<K, V>
	}

}
