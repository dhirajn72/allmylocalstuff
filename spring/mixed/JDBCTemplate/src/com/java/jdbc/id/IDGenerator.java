package com.java.jdbc.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jdbc.util.HibernateUtil;

public class IDGenerator {
	public static String getNextId() {
		String cid = "HCL-001";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db50", "root", "singh99");
			preparedStatement = connection
					.prepareStatement("select max(cust.cid) from customer cust");
			resultSet = preparedStatement.executeQuery();

			String x = null;
			String subStr = null;
			boolean b = resultSet.last();
			x = resultSet.getString(1);
			System.out.println("value of x:" + x);
			if (x != null) {
				subStr = x.substring(4);
				System.out.println("rs:" + resultSet.getString(1));
			}
			if (subStr != null) {
				System.out.println(subStr);
				int y = Integer.parseInt(subStr);
				y = y + 1;
				if (y <= 9) {
					cid = "HCL-00" + y;
				} else if (y <= 99) {
					cid = "HCL-0" + y;
				} else {
					cid = "HCL-" + y;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e.printStackTrace();
			}

		}

		return cid;
	}
}
