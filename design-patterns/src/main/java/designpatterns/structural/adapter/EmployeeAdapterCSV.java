package designpatterns.structural.adapter;

public class EmployeeAdapterCSV implements Employee {
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		super();
		this.instance = instance;
	}

	public String getId() {
		return instance.getString1();
	}

	public String getFirstName() {
		return instance.getString2();
	}

	public String getLastName() {
		return instance.getString3();
	}

	public String getEmail() {
		return instance.getString4();
	}

	public String toString() {
		return "EmployeeAdapterCSV [instance=" + instance + "]";
	}
	

}
