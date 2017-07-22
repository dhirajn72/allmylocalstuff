package com.spring.callable;

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
import org.springframework.stereotype.Repository;
import com.spring.callable.to.CustomerTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addCustomer(final CustomerTO to) {
		final String sql = "call addCustomerData(?,?,?,?)";
		CallableStatementCreator csc = new CallableStatementCreator() {
			public CallableStatement createCallableStatement(Connection con)
					throws SQLException {
				CallableStatement cs = con.prepareCall(sql);
				cs.setInt(1, to.getCid());
				cs.setString(2, to.getCname());
				cs.setString(3, to.getEmail());
				cs.setLong(4, Long.parseLong(to.getPhone()));
				return cs;
			}
		};

		SqlParameter intParameter = new SqlParameter(Types.INTEGER);
		SqlParameter stringParameter = new SqlParameter(Types.VARCHAR);
		SqlParameter longParameter = new SqlParameter(Types.LONGNVARCHAR);

		List<SqlParameter> parameters = new ArrayList<SqlParameter>();
		parameters.add(intParameter);
		parameters.add(stringParameter);
		parameters.add(stringParameter);
		parameters.add(longParameter);

		jdbcTemplate.call(csc, parameters);

	}
}
