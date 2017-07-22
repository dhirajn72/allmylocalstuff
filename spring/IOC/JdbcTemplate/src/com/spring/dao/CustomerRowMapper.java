package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerTO> {

	@Override
	public CustomerTO mapRow(ResultSet rs, int arg1) throws SQLException {
		CustomerTO cust = new CustomerTO();
		cust.setCid(rs.getInt(1));
		cust.setCname(rs.getString(2));
		cust.setEmail(rs.getString(3));
		cust.setPhone(rs.getString(4));
		cust.setCity(rs.getString(5));
		cust.setAge(rs.getInt(6));

		return cust;
	}

}
