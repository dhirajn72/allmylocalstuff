package com.java.jpa.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.peristence.Vehicle;
import com.java.jpa.peristence.Customer;
import com.java.jpa.util.JPAUtil;

public class Test1 {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = new Customer("Singh", "singh@gmail.com",
					"12345");
			entityManager.persist(customer);
			Vehicle vehicle = new Vehicle("Nano", "New", 100000);
			entityManager.persist(vehicle);

			Customer customer1 = new Customer("kumar", "kumar@gmail.com",
					"12345");
			entityManager.persist(customer1);
			Vehicle vehicle2 = new Vehicle("scorpio", "2011", 800000);
			entityManager.persist(vehicle2);

			Customer customer2 = new Customer("Dhiraj", "dhiraj@gmail.com",
					"12345");
			entityManager.persist(customer2);
			Vehicle vehicle3 = new Vehicle("innova", "2014", 100000);
			entityManager.persist(vehicle3);

			Customer customer3 = new Customer("Kumar", "kumar@gmail.com",
					"12345");
			entityManager.persist(customer3);
			Vehicle vehicle4 = new Vehicle("bolero", "2014", 100000);
			entityManager.persist(vehicle4);

			/*
			vehicle.setCustomer(customer);
			vehicle3.setCustomer(customer);
			vehicle4.setCustomer(customer);*/
			vehicle3.setCustomer(customer2);
			vehicle4.setCustomer(customer2);
			
			
			
			
			/*Set<Vehicle> vehicles = new HashSet<Vehicle>();
			vehicles.add(vehicle);
			vehicles.add(vehicle3);
			vehicles.add(vehicle4);
			customer.setVehicles(vehicles);
			
			Set<Vehicle> vehicles1 = new HashSet<Vehicle>();
			vehicles.add(vehicle3);
			vehicles.add(vehicle4);
			customer2.setVehicles(vehicles1);*/

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}
}
