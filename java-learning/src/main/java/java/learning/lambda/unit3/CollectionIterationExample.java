package java.learning.lambda.unit3;

import java.learning.lambda.Person;
import java.util.Arrays;
import java.util.List;

;

public class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Rohit", "AAhuja", 29), new Person("Deepika", "BAhuja", 29),
				new Person("Neena", "CAhuja", 59), new Person("Harish", "DAhuja", 61));
		people.forEach(System.out::println);
		people.forEach(p -> {
			if (p.getFirstName().startsWith("D")) {
				System.out.println(p);
			}
		});
	}
}
