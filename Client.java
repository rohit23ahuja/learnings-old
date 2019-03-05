package design.pattern.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) throws SQLException {
		Client c = new Client();
		c.create();
		c.insert();
		Thread t = null;
		for (int i = 0; i < 4; i++) {
			t = new Thread(new MyRunnable());
			t.start();
		}
	}

	public int create() throws SQLException{
		Connection conn = null;
		Statement stat = null;
		int count = 0;
		try {
			DBSingleton d = DBSingleton.getInstance();
			conn = d.getConnection();
			stat = conn.createStatement();
			count = stat
					.executeUpdate("CREATE TABLE ADDRESS(ID INTEGER, STREETNAME VARCHAR(20), CITY VARCHAR(20))");
		} finally {
			if (stat != null) {
				stat.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return count;
	}
	
	public int insert() throws SQLException {
		Connection conn = null;
		Statement stat = null;
		int count = 0;
		try {
			DBSingleton d = DBSingleton.getInstance();
			conn = d.getConnection();
			stat = conn.createStatement();
			count = stat.executeUpdate("INSERT INTO ADDRESS(ID, STREETNAME, CITY) VALUES(1,'ROHINI','DELHI')");
		} finally {
			if (stat != null) {
				stat.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return count;
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			MyRunnable.fetch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void fetch() throws SQLException {
		Connection conn = null;
		Statement stat = null;
		ResultSet resultSet = null;
		try {
			DBSingleton d = DBSingleton.getInstance();
			conn = d.getConnection();
			stat = conn.createStatement();
			resultSet = stat.executeQuery("SELECT * FROM ADDRESS");
			while (resultSet.next()) {
				System.out
						.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
			} 
		} finally {
			if (resultSet != null) {
				resultSet.close();
			}
			if (stat != null) {
				stat.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	
}
