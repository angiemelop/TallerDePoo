package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoMusico {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void crear(Musico musico) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(musico);
		s.getTransaction().commit();
		s.close();
	}
	protected Musico read(int musicoID) {//select
		Session s =  sessionFactory.openSession();
		Musico musico = s.get(Musico.class, musicoID);
		s.close();
		return musico;
	}
	
	protected void update(Musico musico) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(musico);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int musicoID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Musico musico = new Musico();
		musico.setIdMusico(musicoID);
		s.delete(musico);
		s.getTransaction().commit();
		s.close();
	}
	

}
