package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Books;
import com.entity.Student;

public class HomeMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Books.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Books b=new Books();
		b.setB_id(14);
		b.setB_name("python");
		b.setB_author("james");
		
		
		Books b1=new Books();
		b1.setB_id(15);
		b1.setB_name("gunjan");
		b1.setB_author("james");
		
		
		
		Student s=new Student();
		s.setS_id(3);
		s.setS_name("swapnali");
		s.setCity("pune");
		
		
		
		Student s1=new Student();
		s1.setS_id(4);
		s1.setS_name("swapna2");
		s1.setCity("pune");
				
        ArrayList list1 = new ArrayList(); 
        list1.add(b1);
        list1.add(b);
        s1.setBook(list1);
        s.setBook(list1);
        
        ArrayList list2 = new ArrayList(); 
        list2.add(s);
        list2.add(s1);
        b.setStudent(list2);
        b1.setStudent(list2);

		ss.persist(b);
		ss.persist(b1);
		ss.persist(s);
		ss.persist(s1);

		
		tr.commit();
		ss.close();
		


	}

}
