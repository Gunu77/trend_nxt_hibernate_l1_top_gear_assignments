package number2;

import javax.persistence.*;


@Entity
@Table(name="emp1")




public class employee {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "id", length=4)
	private int empid;
	
	@Column(name = "EMPNAME", length=20)
	private String empname;
	@Column(name = "BAND", length=2)
	private String band;
	
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	

}



