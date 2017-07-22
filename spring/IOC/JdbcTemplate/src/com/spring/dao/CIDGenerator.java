package com.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CIDGenerator {

	public static int getNextCID() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		int res = 01;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db12", "root", "singh99");
			String query = "select max(cust.cid) from customer cust";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				res = resultSet.getInt(1) + 1;
				System.out.println("getNextCID()->" + res);
			}
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}

		}

		return res;
	}
}
