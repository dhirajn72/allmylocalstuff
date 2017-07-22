package com.spring.Id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerID {
	public static int NextCid() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		int x = 001;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String query = "select max(cust.cid) from customer cust";
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db001", "root", "singh99");

			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery(query);
			// do modification//resultSet.next()
			while (resultSet.next()) {
				x = resultSet.getInt(1) + 1;
				// System.out.println(x);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return x;
	}

}
