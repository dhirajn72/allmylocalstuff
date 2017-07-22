package com.java.test;

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

public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(final CustomerTO to) {

		CallableStatementCreator csc = new CallableStatementCreator() {

			@Override
			public CallableStatement createCallableStatement(Connection con)
					throws SQLException {

				String sql = "call custProcedure(?,?,?,?)";
				CallableStatement cs = con.prepareCall(sql);
				cs.setInt(1, to.getCid());
				cs.setString(2, to.getCname());
				cs.setString(3, to.getEmail());
				cs.setString(4, to.getPhone());
				return cs;
			}
		};
		SqlParameter intParameter = new SqlParameter(Types.INTEGER);
		SqlParameter stringParameter2 = new SqlParameter(Types.VARCHAR);

		List<SqlParameter> list = new ArrayList<SqlParameter>();
		list.add(intParameter);
		list.add(stringParameter2);
		list.add(stringParameter2);
		list.add(stringParameter2);
		//System.out.println(jdbcTemplate);
		jdbcTemplate.call(csc, list);

	}
}
