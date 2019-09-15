package designpatterns.structural.adapter;

import java.util.List;

/**
 * we receive list of employees from two different data sources. from our end
 * user perspective we are just getting list from somewhere and printing that
 * list out.
 * 
 * Below line will not work this is where Adapter comes into play. //Employee
 * employeeFromLDAP = new EmmployeeLDAP("2", "Rohit", "Ahuja", "adas"); //
 * Problem : - Due to some reason Ldap object cant implement Employee object and
 * we cannot change EmployeeLdap class code.
 * 
 * @author deepikaahuja
 */
public class AdapterDemo {
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
	}
}
