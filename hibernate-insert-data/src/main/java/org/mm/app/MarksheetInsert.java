package org.mm.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mm.model.Marksheet;


public class MarksheetInsert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rollno:- ");
		int rollno = sc.nextInt();
		
		System.out.println("Enter name:- ");
		String name = sc.next();
		
		System.out.println("Enter the maths marks :- ");
		int maths = sc.nextInt();
		
		System.out.println("Enter the science marks :- ");
		int science = sc.nextInt();
		
		System.out.println("Enter the english marks :- ");
		int english = sc.nextInt();
		
		Marksheet m = new Marksheet(rollno, name, maths, science, english);
		
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
												.configure()
												.build();
		
		SessionFactory sf = new MetadataSources(registry)
						.buildMetadata()
						.buildSessionFactory();

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(m);
		
		t.commit();
		s.close();
		
		System.out.println("Record Inserted....");
	}
}
