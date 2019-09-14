package com.learn.pattern.adapter;

public class EmmployeeLDAP {
	private String cn;
	private String givenName;
	private String surName;
	private String mail;

	public String getCn() {
		return cn;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public String getMail() {
		return mail;
	}

	public EmmployeeLDAP(String cn, String givenName, String surName, String mail) {
		super();
		this.cn = cn;
		this.givenName = givenName;
		this.surName = surName;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "EmmployeeLDAP [cn=" + cn + ", givenName=" + givenName + ", surName=" + surName + ", mail=" + mail + "]";
	}
	
}
