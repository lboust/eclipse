package jsf;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;



public class ServicePerson {
	public void addPerson(Person person) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();				
				session.getTransaction().begin();
				session.persist(person);
				session.getTransaction().commit();
			session.close();
		sessionFactory.close();
		
	}
	
	public List<Person> findAllPeople() {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();	

				session.getTransaction().begin();	
				String queryHQL = "SELECT Person FROM Person";
				Query<Person> query = session.createQuery(queryHQL);
				List<Person> resultQuery = query.getResultList();
				session.getTransaction().commit();
			session.close();
		sessionFactory.close();
		return resultQuery;


	}
}
