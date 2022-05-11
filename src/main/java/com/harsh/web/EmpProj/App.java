package com.harsh.web.EmpProj;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    		Emp e1=new Emp();
    	e1.setEmpId(1);
    	e1.setName("harsh");
    	Emp e2=new Emp();
    	e2.setEmpId(2);
    	e2.setName("jay");
    	Project p1=new Project();
    	p1.setId(123);
    	p1.setName("todo");
    	Project p2=new Project();
    	p2.setId(124);
    	p2.setName("quiz");
    	Project p3=new Project();
    	p3.setId(125);
    	p3.setName("e-com");
    	List<Project>l1= new CopyOnWriteArrayList<Project>();
    	List<Emp>l2= new CopyOnWriteArrayList<Emp>();
    	List<Project>l3= new CopyOnWriteArrayList<Project>();
    	l1.add(p1);l1.add(p3);
    	l2.add(e1);l2.add(e2);
    	l3.add(p2);l3.add(p3);
    	e1.setPrj(l1);
    	e2.setPrj(l3);
    p3.setEmp(l2);
    	SessionFactory sf=new Configuration().configure("hibernate.cnf.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	s.persist(e1);
    	s.persist(e2);
    	s.persist(p1);
    	s.persist(p2);
    	s.persist(p3);
    	t.commit();
    	s.close();
    }
}
