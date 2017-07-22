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
			preparedStatement = connection
					.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			resultSet = preparedStatement.executeQuery(query);
			while (resultSet.next()) {

				System.out.println(resultSet.getInt(1) + " "
						+ resultSet.getString(2) + " " + resultSet.getString(3)
						+ " " + resultSet.getString(4));

			}
			System.out.println("***changing 3rd record***");

			/*
			 * System.out.println(resultSet.getInt(1) + " " +
			 * resultSet.getString(2) + " " + resultSet.getString(3) + " " +
			 * resultSet.getString(4));
			 */
			/*
			 * resultSet.absolute(5); resultSet.updateInt(1, 63);
			 * resultSet.updateString(2, "MK"); resultSet.updateString(3,
			 * "mk@gmail.com"); resultSet.updateString(3, "9743854499");
			 * resultSet.updateRow();
			 * System.out.println("**changed,check DB**");
			 * System.out.println("**Deleting 5th record**");
			 * resultSet.absolute(3); resultSet.deleteRow();
			 * System.out.println("*Done, check DB *");
			 */

			int type = preparedStatement.getResultSetType();
			System.out.println(type);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
