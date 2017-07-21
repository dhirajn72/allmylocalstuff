package com.hibernate.persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

public class IDGenerator {

	public static CustID getNextID() {
		CustID cid = null;

		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			String query = "from Customer c";
			Query query2 = session.createQuery(query);
			List list = query2.list();
			//System.out.println(list);
			if (list.size() == 0) {
				cid = new CustID("CUST", "0001");
			} else {

				String querry = "select max(c.id.cid) from  Customer c where c.id.bid=?";
				Query query3 = session.createQuery(querry);
				query3.setString(0, "CUST");
				String id = query3.list().get(0).toString();
				int x = Integer.parseInt(id);
				System.out.println("parsed from DB-"+x);
				++x ;
				System.out.println("incremented for DB-"+x);
				if (x <9 ||x== 9) {
					cid = new CustID("CUST", "000" + x);
				} else if (x <99 ||x== 99) {
					cid = new CustID("CUST", "00" + x);
				} else if(x<999||x==999) {
					cid = new CustID("CUST", "0" + x);
				} else{
					cid = new CustID("CUST", "" + x);
				}
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
		return cid;
	}

}
