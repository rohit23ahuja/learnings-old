package com.learn.systemdesign.lrucache;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCachePractice {
	private final int cacheSize;
	private LinkedList<String> list;
	private HashMap<String, String> map;

	public LRUCachePractice(int size) {
		cacheSize = size;
		list = new LinkedList<String>();
		map = new HashMap<String, String>(cacheSize);
	}

	public void add(String item) {
		list.add(item);
		map.put(item, item);
	}

	public String get(String s) {
		String item = map.get(s);
		if (item != null) {
			list.remove(item);
			list.addFirst(item);
		}
		return item;
	}

	public String getLRUItem() {
		return list.peekLast();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
