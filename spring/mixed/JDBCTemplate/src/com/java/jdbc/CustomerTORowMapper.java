package com.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerTORowMapper implements RowMapper<CustomerTO> {

	@Override
	public CustomerTO mapRow(ResultSet rs, int val) throws SQLException {
		CustomerTO customerTO = new CustomerTO();
		customerTO.setCid(rs.getString(1));
		customerTO.setCname(rs.getString(2));
		customerTO.setEmail(rs.getString(3));
		customerTO.setPhone(rs.getString(4));
		customerTO.setDob(rs.getString(5));

		return customerTO;
	}

}
