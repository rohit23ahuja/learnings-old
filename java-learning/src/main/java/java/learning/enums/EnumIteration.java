package java.learning.enums;

import java.util.ArrayList;
import java.util.List;

public class EnumIteration {
	public static void main(String[] args) {
		System.out.println(enumIteration());
	}

	private static List<String> enumIteration() {
		List<String> days = new ArrayList<>();
		Days[] daysarray = Days.values();
		for (Days day : daysarray) {
			days.add(day.toString());
		}
		return days;
	}
}
