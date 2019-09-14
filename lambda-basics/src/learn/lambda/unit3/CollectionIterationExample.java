package learn.lambda.unit3;

import java.util.Arrays;
import java.util.List;

import learn.lambda.Person;

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
