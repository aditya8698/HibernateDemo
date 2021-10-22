package utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.*;

public class HibernateUtil {

private static SessionFactory sf;
	
	public static SessionFactory getSession() {
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
		
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		
		sf = cfg.buildSessionFactory(sr);
		
		return sf;
	}
	
}
