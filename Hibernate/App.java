package com.hibernateapp.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateapp.entity.Movie;

public class App {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Movie.class);

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Movie movie1 = new Movie(1, "Valimai", "AK");

		session.save(movie1);

		System.out.println("movie1 saved------->");

		session.getTransaction().commit();

		session.close();

	}

}
