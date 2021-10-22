package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.User;
import utility.HibernateUtil;

public class Dao {

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		List<User> listUser = null;
		Session session = HibernateUtil.getSession().openSession();
		Transaction tx = session.beginTransaction();
		listUser = session.createQuery("from user").getResultList();
		tx.commit();
		session.close();
		return listUser;
	}
	
}
