package number6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import number6.employee;



public class methods {
	
	private static SessionFactory factory;
	
	
	public void add(String ename,int pno,int yoe)
	{   Session  session=null;
		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         session = factory.openSession();
	         
	         Transaction  tx =(Transaction) session.beginTransaction();
	         
	        
	         passport p=new passport();
	         p.setPno(pno);
	         p.setYoe(yoe);
	         
	         employee emp=new employee();
	         emp.setPort(p);
	         emp.setEname(ename);
	         
	         emp.setPort(p);
	     p.setEmp(emp);
	     
	             
	         session.persist(emp);    
	           
	           // session.save(emp); 
	            
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
	     
	}}

	
