package com.learn.pattern.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {

	public static void main(String[] args) {
		DBSingleton instance = DBSingleton.getInstance();
		long timeBefore, timeAfter;
		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		System.out.println("Time taken "+ (timeAfter-timeBefore));
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate("create table address(ID INTEGER, STREETNAME VARCHAR(20), CITY VARCHAR(20))");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		System.out.println("Time taken "+ (timeAfter-timeBefore));
	}

}
