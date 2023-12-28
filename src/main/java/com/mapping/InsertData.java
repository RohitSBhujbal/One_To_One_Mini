package com.mapping;

import com.Model.PassportInfo;
import com.Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertData {
	public static void main(String[] args) {
		
		SessionFactory factory=SessionFactoryHelper.getSessionFactory();
		Session session=factory.openSession();

		PassportInfo pass=new PassportInfo();
		pass.setCountry("INDIA");
		pass.setPass_Number(123456789);
		
		PersonInfo person=new PersonInfo();
		person.setPerson_First_Name("ROHIT");
		person.setPerson_Last_Name("BHUJBAL");
		person.setPerson_Age(23);
		person.setPesrson_Salary(34000.99);
		
		person.setPass_Info(pass);
		
		Transaction tx=session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
		factory.close();
			
	}
	

}
