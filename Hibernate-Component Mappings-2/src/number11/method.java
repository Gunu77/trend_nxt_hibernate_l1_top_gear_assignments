package number11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class method {

	
private static SessionFactory factory;
	
	
	public void saveregular(String name,int salary,int qplc)
	{   Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	       regularemployee remp=new regularemployee();
	       remp.setName(name);
	       remp.setSalary(salary);
	       remp.setQplc(qplc);
	       
	     
	           
	             session.persist(remp);  
	            
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
     
}

	public void savecontract(String name,int salary,int allowance)
	{   Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	       contractemployee remp=new contractemployee();
	       remp.setName(name);
	       remp.setSalary(salary);
	       remp.setAllowance(allowance);
	       
	     
	           
	             session.persist(remp);  
	            
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
     
}

	
	
	public void del(int empid)
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
	     
	}
		

}
