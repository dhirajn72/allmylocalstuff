package com.java.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestB {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = JdbcUtil.getConnection();
			String query = "select * from customer";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int cid = resultSet.getInt(1);
				String cname = resultSet.getString(2);
				String email = resultSet.getString(3);
				String phone = resultSet.getString(4);
				System.out.println(cid + " " + cname + " " + email + " "
						+ phone);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
