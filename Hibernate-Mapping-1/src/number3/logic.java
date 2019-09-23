package number3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import number3.question;

public class logic {
	private static SessionFactory factory; 
	
	public static void main(String[] args) {
	
		

		Session  session=null ;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	  	 	  	   answer a=new answer();
	  	 	  	   a.setAnswers("green");
	  	 	    List <answer> la=new ArrayList<>();
	 	  	   la.add(a);
	  	 	    question q=new question("leaf colour",la);
	  	   
	  	         session.save(q); 
	  	  
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

