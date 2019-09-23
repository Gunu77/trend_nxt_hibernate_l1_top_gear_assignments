package number9;


import java.util.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class logic {
	private static SessionFactory factory;
	public static void main(String[] args) {
		Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         
	         Transaction  tx =(Transaction) session.beginTransaction();
	         @SuppressWarnings("unchecked")
			List<Car> l = session.createQuery("from Car where Price<=600000").list();
	         
	         for (int i=0;i<l.size();i++)
	         {
	        	 System.out.print(l.get(i).getRegNo()+"   ");
	        	 System.out.print(l.get(i).getModel()+"   ");
	        	 System.out.print(l.get(i).getColor()+"   ");
	        	 System.out.print(l.get(i).getManufacturer()+"   ");
	        	 System.out.print(l.get(i).getPrice()+"   ");
	        	 System.out.println();
	         }
	         
	         
	         
	        

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


