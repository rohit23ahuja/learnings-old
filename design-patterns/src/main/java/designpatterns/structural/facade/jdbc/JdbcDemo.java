package designpatterns.structural.facade.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			//DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			String dbUrl = "jdbc:derby:codejava/facadedb;create=true";
			Connection connection = DriverManager.getConnection(dbUrl);
			Statement statement = connection.createStatement();
			statement.executeUpdate("create table address(ID INTEGER, STREETNAME VARCHAR(20), CITY VARCHAR(20))");
			System.out.println("Table Created");
			statement.close();
			statement = connection.createStatement();
			int count = statement.executeUpdate("INSERT INTO ADDRESS(ID, STREETNAME, CITY) VALUES(1,'ROHINI','DELHI')");
			System.out.println(count +" records created");
			statement.close();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM ADDRESS");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
