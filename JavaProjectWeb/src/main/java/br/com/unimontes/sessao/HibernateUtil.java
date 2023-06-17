package br.com.unimontes.sessao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getCurrentSession() {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
}
