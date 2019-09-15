package java.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		//list.parallelStream().forEach(element -> doWork(element));
		List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		resultList.stream().forEach(e -> System.out.println(e));
	}
	
	public static void doWork(String e){
		System.out.println(e);
	}
}
