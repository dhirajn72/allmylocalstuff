package com.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(CustomerTO to) {
		String query = "insert into customers values(?,?,?,?,?)";
		Object[] args = { to.getCid(), to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity() };
		jdbcTemplate.update(query, args);

	}

	@Override
	public void deleteCustomer(int cid) {
		String query = "delete from customers where cid=?";
		Object[] args = { cid };
		jdbcTemplate.update(query, args);

	}

	@Override
	public void updateCustomer(CustomerTO to) {

		String query = "update customers set email=?,phone=? where cid=?";
		Object[] args = { to.getEmail(), to.getPhone(), to.getCid() };
		jdbcTemplate.update(query, args);

	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> customerTOs = new ArrayList<CustomerTO>();
		String query = "select * from customers";
		customerTOs = jdbcTemplate.query(query, new CustomerRowMapper());
		return customerTOs;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String query = "select * from customers where cid=?";
		Object[] args = { cid };
		return jdbcTemplate
				.queryForObject(query, args, new CustomerRowMapper());
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		String query = "select * from customers where city=?";
		Object[] args = { city };
		List<CustomerTO> list = jdbcTemplate.query(query, args,
				new CustomerRowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String query = "select * from customers where email=?";
		Object[] args = { email };
		return jdbcTemplate
				.queryForObject(query, args, new CustomerRowMapper());
	}

}
