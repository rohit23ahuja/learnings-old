package com.pkg.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("value1");
		Iterator<String> ite = list.iterator();
		list.remove(0);
		while(ite.hasNext())
			System.out.println(ite.next());
	}
}
