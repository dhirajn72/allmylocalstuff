package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.TablePerSubClass.DayshiftEmployee;
import com.hibernate.persistence.TablePerSubClass.NightshiftEmployee;
import com.hibernate.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.geSessionFactory().openSession();
			transaction = session.beginTransaction();

			DayshiftEmployee dayshiftEmployee = (DayshiftEmployee) session
					.load(DayshiftEmployee.class, 3);
			System.out.println(dayshiftEmployee + " "
					+ dayshiftEmployee.getEid() + " "
					+ dayshiftEmployee.getEname());

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
