package number3;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name="Ques")
public class question implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name="qid")
	private int id;
	
	@Column(name="Qname")
	private String qname;
	@ElementCollection
	private List <answer> ans;
	
	
	
	
	public List<answer> getAns() {
		return ans;
	}
	public void setAns(List<answer> ans) {
		this.ans = ans;
	}
	
	
	
	public question(String qname, List<answer> ans) {
		super();
		this.qname = qname;
		this.ans = ans;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}


}
