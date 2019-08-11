package com.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
/*	public static void main(String[] args) {
		Employee e1 = null;
		Employee e2 = new Employee("2", "deepika", 2000);
		Optional<Employee> e = Optional.ofNullable(e1);
		System.out.println(e.get().getName().length());
		
		
	}*/
	
	private static final String[] EXCLUDE_PATHS = {"xyz/abc", "def/ghi"}; 
	public static void main(String[] args) {
		String s = "google.com/xyz/abc";
		List<String> out = Arrays.stream(EXCLUDE_PATHS).map(String::toLowerCase).filter(s::contains).collect(Collectors.toList());
		System.out.println(out);
		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		String x = strings.stream().findFirst().get();
}
}