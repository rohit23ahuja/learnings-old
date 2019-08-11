package com.learn.pattern.adapter;

public class EmployeeAdapterLDAP implements Employee {
	private EmmployeeLDAP instance;

	public EmployeeAdapterLDAP(EmmployeeLDAP instance) {
		super();
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterLDAP [instance=" + instance + "]";
	}
}
