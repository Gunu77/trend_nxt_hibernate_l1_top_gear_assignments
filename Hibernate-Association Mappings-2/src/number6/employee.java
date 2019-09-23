package number6;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="Employee_passport")
public class employee implements  Serializable {
		private static final long serialVersionUID = 1L;
		


		@Id
		@GeneratedValue (strategy=GenerationType.IDENTITY)
		@Column(name = "Eid", length=4)
	    @PrimaryKeyJoinColumn
		private int eid;
		
		@Column (name="EmpName")
		private String ename;
		

		@OneToOne(targetEntity=passport.class,cascade=CascadeType.ALL) 
		private passport port;


		public String getEname() {
			return ename;
		}


		public void setEname(String ename) {
			this.ename = ename;
		}


		public passport getPort() {
			return port;
		}


		public void setPort(passport port) {
			this.port = port;
		}
		
		

	

	
}
