package com.mapping;

import com.Model.PassportInfo;
import com.Model.PersonInfo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	
	static SessionFactory getSessionFactory() {
		Configuration cfg=new Configuration().configure("resources/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(PersonInfo.class);
		cfg=cfg.addAnnotatedClass(PassportInfo.class);
		SessionFactory factory=cfg.buildSessionFactory();
		
		return factory;
		
}
}
