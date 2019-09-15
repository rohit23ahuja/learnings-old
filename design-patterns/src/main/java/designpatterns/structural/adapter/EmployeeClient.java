package designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employeeFromDB = new EmployeeDB("1", "Deepika", "Ahuja", "abc@xyz.com");
		employees.add(employeeFromDB);
		EmmployeeLDAP employeeFromLDAP = new EmmployeeLDAP("2", "Rohit", "Ahuja", "adas");
		employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));
		EmployeeCSV employeeCSV = new EmployeeCSV("3,Harish,Ahuja,sdflk");
		employees.add(new EmployeeAdapterCSV(employeeCSV));
		return employees;
	}
}
