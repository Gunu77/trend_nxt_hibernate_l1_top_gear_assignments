package number11;

import javax.persistence.*;  

@Entity  
@DiscriminatorValue("contractemployee")  
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
