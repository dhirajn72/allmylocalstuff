package com.java.core;

import javax.sql.RowSet;

import com.sun.rowset.JdbcRowSetImpl;

public class TestB {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			RowSet rowSet = new JdbcRowSetImpl();
			rowSet.setUrl("jdbc:mysql://localhost:3306/db01");
			rowSet.setUsername("root");
			rowSet.setPassword("singh99");
			rowSet.setCommand("select * from customer");
			rowSet.execute();
			while (rowSet.next()) {
				System.out
						.println(rowSet.getInt(1) + " " + rowSet.getString(2)
								+ " " + rowSet.getString(3) + " "
								+ rowSet.getString(4));
			}
			System.out.println("************");
			System.out.println("Changing 5th record");
			rowSet.absolute(5);
			rowSet.updateInt(1, 11);
			rowSet.updateString(2, "rajeev");
			rowSet.updateString(3, "raj@gmail.com");
			rowSet.updateString(4, "9742765205");
			rowSet.updateRow();
			while (rowSet.next()) {
				System.out
						.println(rowSet.getInt(1) + " " + rowSet.getString(2)
								+ " " + rowSet.getString(3) + " "
								+ rowSet.getString(4));
			}
			System.out.println("**********************");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
