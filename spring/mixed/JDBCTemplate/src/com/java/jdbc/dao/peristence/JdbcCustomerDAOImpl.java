package com.java.jdbc.dao.peristence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.java.jdbc.CustomerTO;
import com.java.jdbc.CustomerTORowMapper;
import com.java.jdbc.dao.CustomerDAO;

public class JdbcCustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(CustomerTO customerTO) {
		String query = "insert into customer values(?,?,?,?,?)";
		Object[] vals = { customerTO.getCid(), customerTO.getCname(),
				customerTO.getEmail(), customerTO.getPhone(),
				customerTO.getDob() };
		jdbcTemplate.update(query, vals);

	}

	@Override
	public void deleteCustomer(String cid) {
		String querry = "delete from customer where cid=?";
		Object[] arr = { cid };
		jdbcTemplate.update(querry, arr);

	}

	@Override
	public void updateCustomer(CustomerTO customerTO) {
		String querry = "update customer set sname=?,email=?,phone=?,dob=? where cid=?";
		Object[] arr = { customerTO.getCname(), customerTO.getEmail(),
				customerTO.getPhone(), customerTO.getDob(), customerTO.getCid() };
		jdbcTemplate.update(querry, arr);

	}

	@Override
	public CustomerTO getCustomerByCid(String cid) {
		String querry = "select * from customer where cid=?";
		Object[] arr = { cid };
		CustomerTO customerTO = (CustomerTO) jdbcTemplate.queryForObject(
				querry, arr, new CustomerTORowMapper());
		return customerTO;
	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		String querry = "select * from customer";
		List<CustomerTO> list = jdbcTemplate.query(querry,
				new CustomerTORowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String querry = "select * from customer where email=?";
		Object[] arr = { email };
		CustomerTO customerTO = jdbcTemplate.queryForObject(querry, arr,
				new CustomerTORowMapper());
		return customerTO;

	}

}
