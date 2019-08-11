package com.learn.pattern.adapter;

public class EmployeeAdapterCSV implements Employee {
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		super();
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getString1();
	}

	@Override
	public String getFirstName() {
		return instance.getString2();
	}

	@Override
	public String getLastName() {
		return instance.getString3();
	}

	@Override
	public String getEmail() {
		return instance.getString4();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterCSV [instance=" + instance + "]";
	}
	

}
