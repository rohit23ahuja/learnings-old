package designpatterns.creational.builder;

import java.util.ArrayList;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("This is an example of BuilderPattern ");
		sb.append("by StringBuilder class ");
		sb.append(new ArrayList<>());
		sb.append(" ");
		sb.append(42);
		sb.append(" you can virtually append anything");
		System.out.println(sb.toString());
	}
}
