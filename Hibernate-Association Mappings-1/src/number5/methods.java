package number5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import number5.employee;



public class methods {
	private static SessionFactory factory; 
	public void add(String dname,String ename1,String ename2,String ename3)
	{

		Session  session=null ;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         employee e1=new employee();
	         e1.setEname(ename1);
	         employee e2=new employee();
	         e2.setEname(ename2);
	         employee e3=new employee();
	         e3.setEname(ename3);
	         List<employee> l=new ArrayList<>();
	         l.add(e1);
	         l.add(e2);
	         l.add(e3);
	         department d=new department();
	         d.setDname(dname);
	         d.setEmp(l);
	         
	        
	  	   
	  	         session.save(d); 
	  	  
	  	         tx.commit();
	      }
		 
		 catch (Throwable ex) { 
			 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         
	         throw new ExceptionInInitializerError(ex); 
	      }
		 
		
	      
	      
	      finally
	      {
	
	    	 session.close(); 
	      }
	}
	
	
	
	public void del(int did)
	{

		Session  session=null ;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	         
	       
	        department d=new department();
	         d=session.get(department.class,did);
	        session.delete(d);
	  	         tx.commit();
	      }
		 
		 catch (Throwable ex) { 
			 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         
	         throw new ExceptionInInitializerError(ex); 
	      }
		 
		
	      
	      
	      finally
	      {
	
	    	 session.close(); 
	      }
	}
	}


