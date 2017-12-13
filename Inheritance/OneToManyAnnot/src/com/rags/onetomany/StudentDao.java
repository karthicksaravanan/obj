package com.rags.onetomany;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class StudentDao {

	SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	private Session getSession() {
		Session s = null;
		try {
			sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
			s = sessionFactory.openSession();

		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}

	public void insertStudent(Student si) {
		try {
			Session s = getSession();
			Transaction transaction = s.beginTransaction();
			s.save(si);
			//s.save(b);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Student> getStudent(long id) {
		@SuppressWarnings("rawtypes")
		List ls=null;		
		try {
			Session s = getSession();
ls=s.createCriteria(Student.class).add(Restrictions.eq("studentId",id)).list();
          //  System.out.println(ls.size());
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		return ls;
	}
	
	

}
