package com.hibernate.client;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.dao.CustomerDAOFactory;
import com.hibernate.persistence.id.CustomerID;
import com.hibernate.to.CustomerTO;

public class Test1 {

	public static void main(String[] args) {

		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();

		/*
		 * for (int i = 0; i < 500; i++) { CustomerTO to1 = new
		 * CustomerTO(CustomerID.getNextId(), "dhiraj", "dhiraj@gmail.com",
		 * "9743854499", "25", "Pune", "45000", "VISA"); dao.addCustomer(to1); }
		 */

		CustomerTO to2 = new CustomerTO(CustomerID.getNextId(), "punit",
				"punit@gmail.com", "9743854499", "20", "Bangalore", 45000,
				"VISA");
		dao.addCustomer(to2);

		CustomerTO to3 = new CustomerTO(CustomerID.getNextId(), "abhi",
				"abhi@gmail.com", "9743854499", "25", "Bangalore", 55000,
				"VISA");
		dao.addCustomer(to3);

		CustomerTO to4 = new CustomerTO(CustomerID.getNextId(), "rahul",
				"rahul@gmail.com", "9743854499", "34", "Aurangabad", 67000,
				"VISA");
		dao.addCustomer(to4);

		CustomerTO to5 = new CustomerTO(CustomerID.getNextId(), "binod",
				"binod@gmail.com", "9743854499", "26", "Aurangabad", 25000,
				"VISA");
		dao.addCustomer(to5);

		/*
		 * * CustomerTO to6 = new CustomerTO(CustomerID.getNextId(), "sandeep",
		 * "sandeep@gmail.com", "9743854499", "25", "Bangalore", "45000",
		 * "VISA"); dao.addCustomer(to6);
		 * 
		 * CustomerTO to7 = new CustomerTO(CustomerID.getNextId(), "himanshu",
		 * "himanshu@gmail.com", "9743854499", "25", "Pune", "45000", "MASTRO");
		 * dao.addCustomer(to7);
		 * 
		 * CustomerTO to8 = new CustomerTO(CustomerID.getNextId(), "raj",
		 * "raj@gmail.com", "9743854499", "25", "Ranchi", "45000", "VISA");
		 * dao.addCustomer(to8);
		 * 
		 * CustomerTO to9 = new CustomerTO(CustomerID.getNextId(), "pankaj",
		 * "pankaj@gmail.com", "9743854499", "26", "Aurangabad", "45000",
		 * "MASTRO"); dao.addCustomer(to9);
		 * 
		 * CustomerTO to10 = new CustomerTO(CustomerID.getNextId(), "dhano",
		 * "dhano@gmail.com", "9743854499", "28", "Bangalore", "45000", "VISA");
		 * dao.addCustomer(to10);
		 * 
		 * CustomerTO to11 = new CustomerTO(CustomerID.getNextId(), "chandu",
		 * "chandu@gmail.com", "9743854499", "25", "Pune", "45000", "MASTRO");
		 * dao.addCustomer(to11);
		 * 
		 * CustomerTO to12 = new CustomerTO(CustomerID.getNextId(), "vinit",
		 * "vinit@gmail.com", "9743854499", "14", "Ranchi", "45000", "VISA");
		 * dao.addCustomer(to12);
		 * 
		 * CustomerTO to13 = new CustomerTO(CustomerID.getNextId(), "manish",
		 * "manish@gmail.com", "9743854499", "40", "Bangalore", "45000",
		 * "MASTRO"); dao.addCustomer(to13);
		 * 
		 * CustomerTO to14 = new CustomerTO(CustomerID.getNextId(),
		 * "dharmendra", "dharmendra@gmail.com", "9743854499", "38",
		 * "Bangalore", "45000", "MASTRO"); dao.addCustomer(to14);
		 * 
		 * CustomerTO to15 = new CustomerTO(CustomerID.getNextId(), "dande",
		 * "dande@gmail.com", "9743854499", "50", "Ranchi", "45000", "VISA");
		 * dao.addCustomer(to15);
		 * 
		 * CustomerTO to16 = new CustomerTO(CustomerID.getNextId(), "sri",
		 * "sri@gmail.com", "9743854499", "25", "Bangalore", "45000", "MASTRO");
		 * dao.addCustomer(to16);
		 * 
		 * CustomerTO to17 = new CustomerTO(CustomerID.getNextId(), "raghu",
		 * "raghu@gmail.com", "9743854499", "25", "Ranchi", "45000", "VISA");
		 * dao.addCustomer(to17);
		 * 
		 * CustomerTO to18 = new CustomerTO(CustomerID.getNextId(), "lohar",
		 * "lohar@gmail.com", "9743854499", "25", "Ranchi", "45000", "SA");
		 * dao.addCustomer(to18);
		 * 
		 * CustomerTO to19 = new CustomerTO(CustomerID.getNextId(), "alok",
		 * "alok@gmail.com", "9743854499", "26", "Bangalore", "45000",
		 * "VISASA"); dao.addCustomer(to19);
		 * 
		 * CustomerTO to20 = new CustomerTO(CustomerID.getNextId(), "ranjan",
		 * "ranjan@gmail.com", "9743854499", "25", "Bangalore", "45000",
		 * "VISA"); dao.addCustomer(to20);
		 * 
		 * CustomerTO to21 = new CustomerTO(CustomerID.getNextId(), "dk",
		 * "dk@gmail.com", "9743854499", "25", "Bangalore", "45000", "VISA");
		 * dao.addCustomer(to21);
		 * 
		 * CustomerTO to22 = new CustomerTO(CustomerID.getNextId(), "singh",
		 * "singh@gmail.com", "9743854499", "25", "Bangalore", "45000", "SA");
		 * dao.addCustomer(to22);
		 */
	}
}
