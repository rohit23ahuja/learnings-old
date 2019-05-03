package learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListsFiltering {
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
