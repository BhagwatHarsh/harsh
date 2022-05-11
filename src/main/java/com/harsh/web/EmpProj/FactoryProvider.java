package com.harsh.web.EmpProj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	public static SessionFactory  fact() {
		SessionFactory sf=new Configuration().configure("hibernate.cnf.xml").buildSessionFactory();
		return sf;
	}
}
