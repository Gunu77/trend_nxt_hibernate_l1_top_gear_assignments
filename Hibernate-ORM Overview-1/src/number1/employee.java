package number1;

public class employee {
	 private int id;
	   private String name; 
	   private String designation;   
	   private int salary;  

	   public employee() {}
	   public employee(String name, String designation, int salary) {
	      this.name = name;
	      this.designation = designation;
	      this.salary = salary;
	   }
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	  
	   
	}

