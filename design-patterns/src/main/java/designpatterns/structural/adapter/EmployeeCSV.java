package designpatterns.structural.adapter;

public class EmployeeCSV {
	private String[] employeeDetails;

	public EmployeeCSV(String employeeString) {
		super();
		this.employeeDetails = employeeString.split(",");
	}

	public String toString() {
		return "ID ["+employeeDetails[0]+"] firstName ["+employeeDetails[1]+"] lastName ["+employeeDetails[2]+"] email ["+employeeDetails[3]+"]"; 
	}
	
	public String getString1() {
		return employeeDetails[0];
	}
	
	public String getString2() {
		return employeeDetails[1];
	}
	
	public String getString3() {
		return employeeDetails[2];
	}
	
	public String getString4() {
		return employeeDetails[3];
	}
}
