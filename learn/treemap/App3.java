package learn.treemap;

import java.util.Set;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		String s1 = new String("");
		Set<Country> s = new TreeSet<>((Country o1, Country o2) -> o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()));
		s.add(new Country("Indi"));
		s.add(new Country("chini"));
		s.add(new Country("indi"));
		
		s.stream().forEach(c -> System.out.println(c.getName()));
	}

}
