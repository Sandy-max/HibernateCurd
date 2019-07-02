package com.opentext.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.Employee.dto.StudentInformation;



/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		
	    StudentInformation si=new StudentInformation();
	    si.setEid(60);
	    si.setEname("roshan");
	    si.setDesignation("ML");
	    si.setSalary(500000);
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(StudentInformation.class);
		cfg.configure("hibernate.cfg.xml");
		System.out.println("tyuil");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t =s.beginTransaction();
		s.save(si);
		t.commit();
		
		 
		s.close();
		
	}

}




