package number10;
import javax.persistence.*;  

@Entity  
@Table(name = "employee123")  
@Inheritance(strategy=InheritanceType.JOINED)  
  
public class employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) 
@Column (name="ID")
	private int id;
@Column(name="EmpName")
	private String name;
@Column (name="Salary")
	private int salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


	
	
}

