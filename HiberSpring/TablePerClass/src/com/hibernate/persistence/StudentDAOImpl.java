package com.hibernate.persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.StudentDAO;
import com.hibernate.util.HibernateUtil;

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
	public Student getStudent(int sid) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Student student = null;
		try {
			student = (Student) session.load(WeekendStudent.class, sid);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
		return student;
	}

}
