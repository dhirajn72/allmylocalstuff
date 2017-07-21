package com.java.peristence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;

import com.java.dao.CustomerDAO;
import com.java.to.CustomerTO;

public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(final CustomerTO to) {

		CallableStatementCreator csc = new CallableStatementCreator() {
			@Override
			public CallableStatement createCallableStatement(
					Connection connection) throws SQLException {
				String query = "call custInfo(?,?,?,?)";
				CallableStatement cs = connection.prepareCall(query);
				cs.setInt(1, to.getCid());
				cs.setString(2, to.getCname());
				cs.setString(3, to.getEmail());
				cs.setString(4, to.getPhone());
				return cs;
			}
		};
		SqlParameter intParam = new SqlParameter(Types.INTEGER);
		SqlParameter charParam = new SqlParameter(Types.VARCHAR);
		List<SqlParameter> sqlParameters = new ArrayList<SqlParameter>();
		sqlParameters.add(intParam);
		sqlParameters.add(charParam);
		sqlParameters.add(charParam);
		sqlParameters.add(charParam);
		jdbcTemplate.call(csc, sqlParameters);

	}
}