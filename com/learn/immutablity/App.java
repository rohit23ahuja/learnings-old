package com.learn.immutablity;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address();
		a.setCity("gurgaon");
		a.setHouse("602");
		Employee e = new Employee("rohit", a);
		System.out.println(e.getName()+" "+e.getEmployeeAddress().getCity()+" "+e.getEmployeeAddress().getHouse());
		//a.setCity("delhi");
		//a.setHouse("44");
		e.getEmployeeAddress().setCity("goa");
		e.getEmployeeAddress().setHouse("23");
		System.out.println(e.getName()+" "+e.getEmployeeAddress().getCity()+" "+e.getEmployeeAddress().getHouse());
	}

}
