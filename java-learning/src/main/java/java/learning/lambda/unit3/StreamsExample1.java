package java.learning.lambda.unit3;

import java.learning.lambda.Person;
import java.util.Arrays;
import java.util.List;


public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Rohit", "Ahuja", 30), new Person("Deepika", "Ahuja", 30),
				new Person("Neena", "Ahuja", 59), new Person("Harish", "Ahuja", 61),
				new Person("Rachika", "Oberoi", 35), new Person("Manit", "Oberoi", 40),
				new Person("Reyna", "Oberoi", 10), new Person("Harbans", "Gulati", 62),
				new Person("Prem", "Gulati", 60), new Person("Ashish", "Gulati", 39),
				new Person("Cherry", "Gulati", 36), new Person("Anhad", "Gulati", 6), new Person("Jatin", "Gulati", 34),
				new Person("Tanu", "Gulati", 32));
		
		System.out.println(people.stream().max((p1, p2) -> {
			if (p1.getAge()<p2.getAge()) {
				return -1;
			} else if (p1.getAge()>p2.getAge()) {
				return 1;
			}
			 return 0;
		}).get());
		
		people.stream()
		.filter(p->p.getFirstName().startsWith("R"))
		.forEach(p -> System.out.println(p));
		
		System.out.println(people.stream().filter(p -> p.getLastName().startsWith("O")).count());
	}
}
