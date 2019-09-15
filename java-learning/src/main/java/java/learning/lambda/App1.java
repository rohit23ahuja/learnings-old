package java.learning.lambda;

import java.util.function.Function;

public class App1 {

	public static void main(String[] args) {
		App1 a = new App1();
		String result = a.add("Message", p ->{
			p = p +" from lambda";
			return p.toUpperCase();
		});
		System.out.println(result);
	}

	public String add(String s, Function<String, String> f) {
		return f.apply(s);
	}

}
