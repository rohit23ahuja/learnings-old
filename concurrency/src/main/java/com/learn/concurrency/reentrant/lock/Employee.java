package com.learn.concurrency.reentrant.lock;

public class Employee extends Person {
	private String company = new String("rbs");
	
	public String getCompany(){
/*		synchronized (lock1) {
			return company + super.getAge();	
		}*/
		return company + super.getAge();
	}
}
