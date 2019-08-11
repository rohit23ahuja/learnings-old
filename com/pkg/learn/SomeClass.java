package com.pkg.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SomeClass {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		Stream<String> s = l.stream();
		System.out.println(s.count());
	}
}
