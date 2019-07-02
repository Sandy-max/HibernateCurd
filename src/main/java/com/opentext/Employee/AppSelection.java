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

public class AppSelection {
	public static void main(String[] args) {
		
	
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(StudentInformation.class);
		cfg.configure("hibernate.cfg.xml");
		System.out.println("tyuil");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		StudentInformation r=(StudentInformation) s.load(StudentInformation.class, 105);
		System.out.println(r.getEid());
		System.out.println(r.getEname());
		System.out.println(r.getDesignation());
        System.out.println( r.getSalary());

		s.close();
		
	}

}



