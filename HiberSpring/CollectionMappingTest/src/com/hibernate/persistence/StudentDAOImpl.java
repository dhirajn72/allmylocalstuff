package com.hibernate.persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.StudentDAO;
import com.hibernate.persistence.util.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void addStudent(Student student) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(student);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
	}

	@Override
	public void deleteStudent(int sid) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Student student = (Student) session.load(Student.class, sid);
			session.delete(student);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
	}

}
