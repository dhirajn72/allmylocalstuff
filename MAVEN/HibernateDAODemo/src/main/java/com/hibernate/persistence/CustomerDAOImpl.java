package com.hibernate.persistence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;
import com.hibernate.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	public void addCustomer(CustomerTO to) {
		HibernateTemplate.add(to);

	}

	public void updateCustomer(CustomerTO to) {
		HibernateTemplate.update(to);
	}

	public void deleteCustomer(int cid) {
		HibernateTemplate.delete(cid);
	}

	public CustomerTO getCustomerById(int cid) {
		Transaction transaction = null;
		Customer cust = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			cust = (Customer) session.load(Customer.class, cid);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getAge(), cust.getCity(),
				cust.getSallary(), cust.getCtype());
	}

	public List<CustomerTO> getCustomerByCity(String city, int start, int end) {
		String querry = "from Customer c where c.city=?";
		Transaction transaction = null;
		List<CustomerTO> list = new ArrayList<CustomerTO>();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(querry);
			query = query.setParameter(0, city);
			query = query.setFirstResult(start);
			query = query.setMaxResults(end);
			List list2 = query.list();
			transaction.commit();
			session.close();
			for (Object ob : list2) {
				Customer to = (Customer) ob;
				list.add(new CustomerTO(to.getCid(), to.getCname(), to
						.getEmail(), to.getPhone(), to.getAge(), to.getCity(),
						to.getSallary(), to.getCtype()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return list;

	}

	public List<CustomerTO> getCustomerByCtype(String cType) {

		String hql = "from Customer c where c.ctype=?";
		List list = (List) HibernateTemplate.findList(hql, cType);
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		for (Object ob : list) {
			Customer to = (Customer) ob;
			tos.add(new CustomerTO(to.getCid(), to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge(), to.getCity(), to.getSallary(),
					to.getCtype()));
		}

		return tos;
	}

	public List<CustomerTO> getCustomerByAge(int age) {

		String hql = "from Customer c where c.age=?";
		List list = (List) HibernateTemplate.findList(hql, age + "");
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		for (Object ob : list) {
			Customer to = (Customer) ob;
			tos.add(new CustomerTO(to.getCid(), to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge(), to.getCity(), to.getSallary(),
					to.getCtype()));
		}

		return tos;
	}

	public List<CustomerTO> getAllCustomers() {
		String hql = "from Customer cust";
		List objects = HibernateTemplate.findList(hql);
		List<CustomerTO> tos = new LinkedList<CustomerTO>();
		for (Object ob : objects) {
			Customer to = (Customer) ob;
			tos.add(new CustomerTO(to.getCid(), to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge(), to.getCity(), to.getSallary(),
					to.getCtype()));

		}

		return tos;
	}

	public double getHighestSalary(int limit, int offset) {
		return HibernateTemplate.getSalary(limit, offset);
	}
}
