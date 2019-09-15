package java.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonUser {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Rohit", "AAhuja", 29), new Person("Deepika", "BAhuja", 29),
				new Person("Neena", "CAhuja", 59), new Person("Harish", "DAhuja", 61));
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		printConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("!!!!!!!!!!!!");
		printConditionally(people, p -> p.getLastName().endsWith("a"), p -> System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);;
			}
		}
	}
}
