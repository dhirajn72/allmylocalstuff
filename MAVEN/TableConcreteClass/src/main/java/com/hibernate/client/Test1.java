package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.TablePerConcreteClass.DayshiftEmployee;
import com.hibernate.persistence.TablePerConcreteClass.NightshiftEmployee;
import com.hibernate.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.geSessionFactory().openSession();
			transaction = session.beginTransaction();
			NightshiftEmployee nightshiftEmployee = new NightshiftEmployee(
					"Ashish", "9:00PM", "ThinkCampus", "6:00AM");
			nightshiftEmployee.setEid(2);
			session.save(nightshiftEmployee);
			

			/*DayshiftEmployee dayshiftEmployee = new DayshiftEmployee("Dhiraj",
					"9:00AM", "ThikCampus", "5:00PM");

			session.save(dayshiftEmployee);
			dayshiftEmployee.setEid(2);*/

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
