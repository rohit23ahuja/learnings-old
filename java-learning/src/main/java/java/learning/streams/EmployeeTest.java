package java.learning.streams;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.hasProperty;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void whenIncrementSalary() {
		Employee1 e1 = new Employee1("1", "rohit", 1000);
		Employee1 e2 = new Employee1("2", "deepika", 2000);
		Employee1 e3 = new Employee1("3", "harish", 3000);
		List<Employee1> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		/*Stream.Builder<Employee> streamBuilder = Stream.builder();
		streamBuilder.accept(e1);
		streamBuilder.accept(e2);
		streamBuilder.accept(e3);
		Stream<Employee> stream = streamBuilder.build();
		stream.forEach(e -> e.salaryIncrement(10));*/
		empList.stream().forEach(e -> e.salaryIncrement(10));
		
		//assertThat(empList, contains(hasProperty("salary", equalTo(1010))));
	}
}
