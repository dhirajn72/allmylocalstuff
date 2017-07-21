package com.java.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) {

		Connection connection = null;
		CallableStatement callableStatement = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db002", "root", "singh99");

			String querry = "call custProcedure(?,?,?,?)";

			for (int i = 1; i < 1000; i++) {
				callableStatement = connection.prepareCall(querry);
				callableStatement.setInt(1, i);
				callableStatement.setString(2, "Dhiraj");
				callableStatement.setString(3, "dhiraj@gmail.com");
				callableStatement.setString(4, "9743854499");
				callableStatement.executeQuery();

				System.out.println("Check DB !!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (callableStatement != null)
					callableStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
