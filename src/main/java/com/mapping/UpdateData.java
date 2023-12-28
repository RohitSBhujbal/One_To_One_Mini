package com.mapping;

import com.Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateData {
		public static void main(String[] args) {
			SessionFactory factory=SessionFactoryHelper.getSessionFactory();
			Session session=factory.openSession();
			Transaction tx= session.beginTransaction();
			
			PersonInfo p1=session.load(PersonInfo.class,3);
			p1.getPass_Info().setCountry("AUSTRALIA");
			session.update(p1);
			tx.commit();
			session.close();
		}
}
