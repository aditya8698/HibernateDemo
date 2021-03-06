package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.User;
import util.HibernateUtil;

 
public class UserDao {
	
	
	public void saveUser(User newUser) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		
			transaction = session.beginTransaction();

			session.save(newUser);
		
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
			session.update(user);
			
			transaction.commit();
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}

	
	public void deleteUser(User userdel) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();

			User user = session.get(User.class, userdel.getId());
			if (user != null) {
				session.delete(user);
			}

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public User getUser(int id) {

		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		
			transaction = session.beginTransaction();
		
			user = session.get(User.class, id);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {

		Transaction transaction = null;
		List<User> listOfUser = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		
			transaction = session.beginTransaction();
						
			listOfUser = session.createQuery("from User").getResultList();
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfUser;
	}
}
