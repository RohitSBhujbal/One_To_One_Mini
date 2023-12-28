package com.mapping;

import com.Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class DisplayData {
	public static void main(String[] args) {
		
		SessionFactory factory=SessionFactoryHelper.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		PersonInfo p1=session.load(PersonInfo.class,3);
		
		System.out.println(p1.getPerson_First_Name());
		System.out.println(p1.getPerson_Last_Name());
		System.out.println(p1.getPerson_Age());
		System.out.println(p1.getPesrson_Salary());
		System.out.println(p1.getPass_Info().getCountry());
		System.out.println(p1.getPass_Info().getPass_Number());
		
		session.save(p1);
		tx.commit();
		session.close();
		factory.close();
		
	}
	
	
}
