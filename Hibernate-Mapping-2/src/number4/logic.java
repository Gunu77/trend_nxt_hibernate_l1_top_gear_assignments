package number4;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class logic {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		

		Session  session=null ;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	         country cy=new country();
	         cy.setCoun("india");
	         capital cl=new capital();
	         cl.setCap("delhi");
	        
	         Map<country,capital> cs=new HashMap<>();
	         cs.put(cy,cl);
	         continent con=new continent();
	         con.setCname("Asia");
	         con.setCountries(cs);
	         
	  	 	  	   
	  	   
	  	         session.save(con); 
	  	  
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

