package com.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addCustomer(CustomerTO to) {

		String query = "insert into customer values(?,?,?,?,?,?)";
		Object[] arr = { to.getCid(), to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity(), to.getAge() };
		jdbcTemplate.update(query, arr);

	}

	@Override
	public void deleteCustomer(int cid) {
		String query = "delete from customer where cid=?";
		Object[] arr = { cid };
		jdbcTemplate.update(query, arr);

	}

	@Override
	public void updateCustomer(CustomerTO to) {
		String query = "update customer set cname=?,email=?,phone=?,city=?,age=? where cid=?";
		Object[] arr = { to.getCname(), to.getEmail(), to.getPhone(),
				to.getCity(), to.getAge(), to.getCid() };
		jdbcTemplate.update(query, arr);

	}

	@Override
	public List<CustomerTO> getAllCustomer() {
		List<CustomerTO> cto = new ArrayList<CustomerTO>();
		String query = "select * from customer";
		List<CustomerTO> list = jdbcTemplate.query(query,
				new CustomerRowMapper());
		return list;
	}

	@Override
	public List<CustomerTO> getAllCustomerByCity(String city) {
		String query = "select * from customer where city=?";
		Object[] arr = { city };
		List<CustomerTO> list = jdbcTemplate.query(query, arr,
				new CustomerRowMapper());

		return list;
	}

}
