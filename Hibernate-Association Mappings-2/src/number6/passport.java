package number6;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table (name="Passport_Details")
public class passport implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Passport_No")
	private int pno;
	@Column (name="Year_Of_Expiry")
	private int yoe;
	@OneToOne(targetEntity=employee.class)  
	private employee emp;
	
	
	public employee getEmp() {
		return emp;
	}
public void setEmp(employee emp) {
		this.emp = emp;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	
	

}
