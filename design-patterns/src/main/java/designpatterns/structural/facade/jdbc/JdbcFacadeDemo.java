package designpatterns.structural.facade.jdbc;

import java.util.List;

public class JdbcFacadeDemo {
	public static void main(String[] args) {
		JdbcFacade facade = new JdbcFacade();
		int count = facade.executeQuery("create table address(ID INTEGER, STREETNAME VARCHAR(20), CITY VARCHAR(20))");
		if (count!=0) {
			System.out.println("Table Created");
		}
		count = facade.executeQuery("INSERT INTO ADDRESS(ID, STREETNAME, CITY) VALUES(1,'ROHINI','DELHI')");
		System.out.println(count +" record created");
		count = facade.executeQuery("INSERT INTO ADDRESS(ID, STREETNAME, CITY) VALUES(2,'GURUGRAM','HARYANA')");
		System.out.println(count +" record created");
		List<Address> addresses = facade.getAddresses();
		for (Address address : addresses) {
			System.out.println(address.getId()+" "+address.getStreetName()+" "+address.getCity());
		}
	}
}
