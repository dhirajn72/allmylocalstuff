package com.java.core;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestA {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = JdbcUtil.getConnection();
			String query = "insert into customer values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 105);
			preparedStatement.setString(2, "Singh");
			preparedStatement.setString(3, "singh@gmail.com");
			preparedStatement.setString(4, "99999");
			preparedStatement.executeUpdate();
			System.out.println("record submitted to db");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (preparedStatement != null)
					preparedStatement.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
