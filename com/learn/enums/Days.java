package com.learn.enums;

public enum Days {
	   SUNDAY(""), MONDAY(""), TUESDAY(""), WEDNESDAY(""), THURSDAY(""), FRIDAY(""), SATURDAY("");
	private String abbreviation;
	
	public String getAbbreviation(){
		return abbreviation;
	}
	
	Days(String abbreviation){
		this.abbreviation=abbreviation;
	}
}
