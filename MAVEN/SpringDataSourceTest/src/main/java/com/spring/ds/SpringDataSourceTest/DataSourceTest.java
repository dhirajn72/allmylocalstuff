package com.spring.ds.SpringDataSourceTest;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceTest {

	@Autowired
	private DriverManagerDataSource mysqlDataSource;

	// @Autowired
	//private DataSource oracleDataSource;

	public void showMysqlInfo() {
		try {
			Connection connection = mysqlDataSource.getConnection();
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println(databaseMetaData.getDatabaseProductName());
			System.out.println(databaseMetaData
					.getDefaultTransactionIsolation());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * public void showOracleInfo() { try { Connection connection =
	 * oracleDataSource.getConnection(); DatabaseMetaData databaseMetaData =
	 * connection.getMetaData();
	 * System.out.println(databaseMetaData.getDatabaseProductName());
	 * System.out.println(databaseMetaData .getDefaultTransactionIsolation());
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
