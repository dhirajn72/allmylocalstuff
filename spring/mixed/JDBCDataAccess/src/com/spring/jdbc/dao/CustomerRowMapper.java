package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerTO> {

	@Override
	public CustomerTO mapRow(ResultSet rs, int arg1) throws SQLException {
		CustomerTO CTO = new CustomerTO();
		CTO.setCid(rs.getInt(1));
		CTO.setCname(rs.getString(2));
		CTO.setEmail(rs.getString(3));
		CTO.setPhone(rs.getLong(4));
		CTO.setCity(rs.getString(5));
		return CTO;
	}

}
