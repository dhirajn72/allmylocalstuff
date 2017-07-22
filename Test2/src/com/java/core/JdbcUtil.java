package com.java.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

	public static Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/db01";
		Connection connection = DriverManager.getConnection(url, "root",
				"singh99");
		return connection;

	}
}
