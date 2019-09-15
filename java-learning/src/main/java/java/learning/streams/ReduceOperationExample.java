package java.learning.streams;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReduceOperationExample {
	private List<Employee> employees = new ArrayList<>();
	@Before
	public void setEmployees() {
		Employee e1 = new Employee();
		e1.setAge("25");
		e1.setName("r");
		employees.add(e1);
		Employee e2 = new Employee();
		e2.setAge("27");
		e2.setName("q");
		Employee e3 = new Employee();
		e3.setAge("29");
		e3.setName("s");
		employees.add(e2);
		employees.add(e3);
	}

	@Test
	public void whenApplyReduceOnStream_thenGetValue() {
		Integer sumSal = employees.stream().map(e->Integer.parseInt(e.getAge())).reduce(0, Integer::sum);
		Assert.assertEquals(sumSal, new Integer(81));
	}
}
