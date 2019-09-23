package number5;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Department")
public class department implements  Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "Did", length=4)
	private int did;
	
	@Column (name="DepartmentName")
	private String dname;
	

	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="did")   
	private List <employee> emp;
	
	
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<employee> getEmp() {
		return emp;
	}

	public void setEmp(List<employee> emp) {
		this.emp = emp;
	}

}
