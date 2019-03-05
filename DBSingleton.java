package design.pattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
	private static DBSingleton instance = null;

	private DBSingleton() {
	}

	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
					System.out.println("new instance created");
				}
			}
		}
		System.out.println("Instance returned");
		return instance;
	}

	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:derby:codejava/marchdb;create=true");
		return connection;
	}
	
}
