package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.OneToOneTest.Address;
import com.hibernate.persistence.OneToOneTest.Customer;
import com.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			Address address = new Address("aurangabad", "Bihar", "560000");
			session.save(address);
			Customer customer = new Customer("Singh", "singh@gmail.com",
					"9743854499",34000);
			customer.setAddress(address);
			session.save(customer);

			Address address1 = new Address("patna", "Bihar", "560000");
			session.save(address1);
			Customer customer1 = new Customer("Singh", "singh@gmail.com",
					"9743854499",39000);
			customer1.setAddress(address1);
			session.save(customer1);

			Address address2 = new Address("Ranchi", "jharkhand", "560000");
			session.save(address2);
			Customer customer2 = new Customer("Singh", "singh@gmail.com",
					"9743854499",54000);
			session.save(customer2);
			customer2.setAddress(address2);

			Address address4 = new Address("bokaro", "jharkhand", "560000");
			session.save(address4);
			Customer customer4 = new Customer("Singh", "singh@gmail.com",
					"9743854499",87000);
			customer4.setAddress(address4);
			session.save(customer4);

			Address address5 = new Address("locknow", "up", "560000");
			session.save(address5);
			Customer customer5 = new Customer("Singh", "singh@gmail.com",
					"9743854499",65000);
			customer5.setAddress(address5);
			session.save(customer5);

			Address address6 = new Address("gaya", "Bihar", "560000");
			session.save(address6);
			Customer customer6 = new Customer("Singh", "singh@gmail.com",
					"9743854499",24000);
			customer6.setAddress(address6);
			session.save(customer6);

			Address address7 = new Address("Ranchi", "ka", "560000");
			session.save(address7);
			Customer customer7 = new Customer("Singh", "singh@gmail.com",
					"9743854499",35000);
			session.save(customer7);
			customer7.setAddress(address7);

			Address address8 = new Address("Ranchi", "ka", "560000");
			session.save(address8);
			Customer customer8 = new Customer("Singh", "singh@gmail.com",
					"9743854499",12000);
			customer8.setAddress(address8);
			session.save(customer8);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
