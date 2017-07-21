package org.hibernate.primarykey.composite.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.primarykey.composite.entity.Employee;
import org.hibernate.primarykey.composite.entity.EmployeeID;

public class Test1 {
	public static void main(String[] args) {

		Transaction transaction = null;
		Session session = null;
		try {
			AnnotationConfiguration configuration = new AnnotationConfiguration()
					.configure()
					// .addPackage("org.hibernate.primarykey.composite.entity");
					// .addClass(Employee.class);
					.addAnnotatedClass(Employee.class);

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();

			transaction.begin();
			EmployeeID employeeID = new EmployeeID(69, "EBPP");
			Employee employee = new Employee(employeeID, "singhkumar",
					"singh@gmail.com", "92433555");
			session.save(employee);
			if (!transaction.isActive()) {
				System.out.println("Transaction was active");
				transaction.commit();
			}
			session.flush();
			session.close();
			System.err.println("Object saved successfully !!");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();

			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
			if (transaction != null)
				transaction.rollback();
		}

	}

}
