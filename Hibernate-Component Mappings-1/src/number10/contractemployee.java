package number10;

import javax.persistence.*;  

@Entity  
@Table(name="contractemployee123")  
@PrimaryKeyJoinColumn(name="ID")  
public class contractemployee extends employee{  
	
	
	
	@Column (name="allowance")
	private int allowance;

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
      

}
