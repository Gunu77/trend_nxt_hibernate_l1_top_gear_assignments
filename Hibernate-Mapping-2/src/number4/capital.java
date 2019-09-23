package number4;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class capital implements  Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="CapitalName")
	private String cap;

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}
	

}
