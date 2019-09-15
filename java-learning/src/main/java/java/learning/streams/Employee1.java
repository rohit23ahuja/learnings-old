package java.learning.streams;

public class Employee1 {
	public String id;
	public String name;
	public int salary;

	public Employee1(String id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public void salaryIncrement(int i) {
		salary= salary+i;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
