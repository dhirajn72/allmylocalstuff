package com.spring.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.spring.dao.CustomerDAO;
import com.spring.to.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addCustomer(Customer cust) {
		String query = "insert into customer values(?,?,?,?,?)";
		Object[] args = { cust.getCid(), cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getCity() };
		return jdbcTemplate.update(query, args);

	}

	@Override
	public void deleteCustomer(int cid) {
		String query = "delete from customer   where cid=? ";
		Object[] args = { cid };
		jdbcTemplate.update(query, args);

	}

	@Override
	public void updateCustomer(Customer customer) {

		String query = "select * from customer where cid=?";
		Object[] args = { customer.getCid() };
		Customer cust = jdbcTemplate.queryForObject(query, args,
				new CustomerRowMapper());
		String query2 = "update customer set cname=?,email=?,phone=?,city=? where cid=?";
		Object[] args2 = { customer.getCname(), customer.getEmail(),
				customer.getPhone(), customer.getCity(), cust.getCid() };
		jdbcTemplate.update(query2, args2);

	}

	@Override
	public Customer getCustomer(int cid) {

		String query = "select * from customer where cid=?";
		Object[] args = { cid };
		return jdbcTemplate
				.queryForObject(query, args, new CustomerRowMapper());

	}

	@Override
	public List<Customer> getAllCustomers() {
		String query = "select * from customer";
		List<Customer> list = jdbcTemplate
				.query(query, new CustomerRowMapper());

		return list;
	}

	@Override
	public Customer getCustomerByEmail(String email) {

		String query = "select * from customer where email=?";
		Object[] args = { email.trim() };
		return jdbcTemplate
				.queryForObject(query, args, new CustomerRowMapper());

	}

	@Override
	public List<Customer> getCustomersByCity(String city) {
		String query = "select * from customer where city=?";
		Object[] args={city};
		List<Customer> list = jdbcTemplate
				.query(query,args, new CustomerRowMapper());

		return list;
	
		
	}

}
