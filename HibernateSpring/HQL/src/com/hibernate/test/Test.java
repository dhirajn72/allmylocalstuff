package com.hibernate.test;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.dao.DaoFactory;
import com.hibernate.persistence.CustomerTo;

public class Test {
	public static void main(String[] args) {

		CustomerDAO dao = DaoFactory.getCustomerDAO();

		CustomerTo to = new CustomerTo("rajjo", "rajjo@gmail.com", "9743854499",
				24, 50000, "Visa", "Bangalore", "KA");

		dao.addCustomer(to);
		/*CustomerTo to1 = new CustomerTo("raj", "raj@gmail.com", "9743854499",
				24, 50000, "Visa", "Bangalore", "KA");

		dao.addCustomer(to1);
		CustomerTo to2 = new CustomerTo("him", "him@gmail.com", "9743854499",
				24, 50000, "master", "Bangalore", "KA");

		dao.addCustomer(to2);
		CustomerTo to3 = new CustomerTo("bijon", "bijon@gmail.com",
				"9743854499", 24, 50000, "master", "Bangalore", "KA");

		dao.addCustomer(to3);
*/
	}
}
