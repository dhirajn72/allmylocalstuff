package com.hibernate.persistence.client;

import java.io.PrintStream;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.CustID;
import com.hibernate.persistence.Customer;
import com.hibernate.persistence.IDGenerator;
import com.hibernate.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			System.setOut(new PrintStream("/home/dhiraj/out.txt"));
			String querry = "from Customer cust";
			Query query = session.createQuery(querry);
			List<Customer> list = query.list();
			for (Customer c : list) {
				System.out.println(c);
			}

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
