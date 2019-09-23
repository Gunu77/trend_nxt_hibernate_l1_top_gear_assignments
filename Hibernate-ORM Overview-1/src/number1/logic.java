package number1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class logic {
	private static SessionFactory factory; 
	

	public static void main(String[] args) {
		
		
		
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	      }
		 
		 catch (Throwable ex) { 
			 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         
	         throw new ExceptionInInitializerError(ex); 
	      }
		 Session  session = factory.openSession();
	      
	      
	      try {
	    	 
	     Transaction  tx =(Transaction) session.beginTransaction();
	         
	     employee emp = new employee("Shubham", "Client", 2000);
	     employee emp1 = new employee("Gundeep", "CEO", 8000);
	     
	     System.out.println("Details saved successfully");
	       
	         session.save(emp); 
	         session.save(emp1);
	         tx.commit();
	      }
	      catch (Exception e)
	      {
	    	  System.out.println(e);
	      }
	      finally
	      {
	
	    	  session.close(); 
	      }
	}
}
	      
	
	  
	  
	
		
	
	



