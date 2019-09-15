package designpatterns.structural.bridge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BridgeEverydayDemo {
	public static void main(String[] args) {
		try {
			//DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			String dbUrl = "jdbc:derby:codejava/webdb;create=true";
			Connection connection = DriverManager.getConnection(dbUrl);
			Statement statement = connection.createStatement();
//			statement.executeUpdate("CREATE TABLE ADDRESS (ID INT, STREETNAME VARCHAR(20), CITY VARCHAR(20))");
	//		System.out.println("TABLE CREATED");
//			statement.executeUpdate("insert into address(id, streetname, city) values (1,'pv','delhi')");
			ResultSet resultSet = statement.executeQuery("select * from address");
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String streetname = resultSet.getString(2);
				String city = resultSet.getString(3);
				System.out.println(id +" "+streetname+" "+city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
