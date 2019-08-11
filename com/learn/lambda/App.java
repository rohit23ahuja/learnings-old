package com.learn.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(34);
		A.add(24);
		A.add(44);
		A.add(54);
		//A.forEach(n -> System.out.println(n));
		FuncInterface add = (x,y) -> x+y;
		FuncInterface multiply = (x,y) -> x*y;
		
		App app = new App();
		System.out.println("Addition of "+app.performOperate(4, 2, add));
		System.out.println("Multiply of "+app.performOperate(4, 2, multiply));
		
		System.out.println("==========================================");
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		Function<ArrayList<String>, Map<String, String>> convert = l -> {
			Map<String, String> map = new HashMap<>();
			for (String string : l) {
				map.put(string, string);
			}
			return map;
		};
		
		Map<String, String> result = convert.apply(list);
		System.out.println(result.toString());
	}
	
	private int performOperate(int a, int b, FuncInterface fobj) {
		return fobj.operate(a, b);
	}
	
	
}


/*interface ConversionInterface<T> {
	Map<T, T> convert(ArrayList<T> list);
}*/

interface FuncInterface {
	int operate(int a, int b);
}