package number5;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table (name="EmpTable")
public class employee implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "Eid", length=4)
	private int eid;
	@Column(name="EmpName")
	private String ename;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
