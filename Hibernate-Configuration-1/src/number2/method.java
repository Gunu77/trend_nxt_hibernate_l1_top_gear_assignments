package number2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import number2.employee;

public class method {
	
	private static SessionFactory factory;
	
	
	public String save(String name,String band)
	{   Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	         employee emp = new employee();
	         emp.setEmpname(name);
	         emp.setBand(band);
	     
	           
	             session.save(emp); 
	            
	            // session.save(emp1);
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
      return "details saved";
}

	
	
	public String del(int empid)
	{Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
		     employee emp = new employee();
		     emp= (employee)session.get(employee.class,empid); 
		 
		       
		         session.delete(emp); 
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
	      return "Record deleted";
	}
		

	public employee read(int empid)
	{Session  session=null;
	 employee emp = new employee();
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
		    
		     emp= (employee)session.get(employee.class,empid); 
		 
		       
		        // session.delete(emp); 
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
	      return emp;
	}
		
	
	
	public employee updateband(int empid,String band)
	{Session  session=null;
	 employee emp = new employee();
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
		    
		     emp= (employee)session.get(employee.class,empid); 
		     emp.setBand(band);
		       
		       session.save(emp); 
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
	      return emp;
	}
		


}
