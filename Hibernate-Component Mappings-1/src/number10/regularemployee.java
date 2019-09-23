package number10;
import javax.persistence.*;  
	
	@Entity  
	@Table(name="regularemployee123")  
	@PrimaryKeyJoinColumn(name="ID")  
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
