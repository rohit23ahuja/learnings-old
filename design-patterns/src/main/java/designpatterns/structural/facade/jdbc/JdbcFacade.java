package designpatterns.structural.facade.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
	private Connection connection = null;
	
	public JdbcFacade() {
		try {
			//DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			String dbUrl = "jdbc:derby:codejava/facadedb3;create=true";
			connection = DriverManager.getConnection(dbUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int executeQuery(String sql) {
		int count=0;
		try {
			Statement statement = connection.createStatement();
			count = statement.executeUpdate(sql);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Address> getAddresses(){
		List<Address> addresses = new ArrayList<Address>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM ADDRESS");
			while (resultSet.next()) {
				Address address = new Address();
				address.setId(resultSet.getString(1));
				address.setStreetName(resultSet.getString(2));
				address.setCity(resultSet.getString(3));
				addresses.add(address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addresses;
	}
}

class Address{
	private String id;
	private String streetName;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
