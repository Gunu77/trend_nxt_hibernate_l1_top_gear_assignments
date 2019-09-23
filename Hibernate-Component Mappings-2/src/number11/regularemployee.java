package number11;
import javax.persistence.*;  
	
	@Entity   
	@DiscriminatorValue("regularemployee")  
	public class regularemployee extends employee {  
	      
	@Column(name="qplc")    
	private int qplc;

	public int getQplc() {
		return qplc;
	}

	public void setQplc(int qplc) {
		this.qplc = qplc;
	}  
	  
	
	  

}
