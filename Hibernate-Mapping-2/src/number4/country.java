package number4;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class country implements  Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="CountryName")
	private String coun;

	public String getCoun() {
		return coun;
	}

	public void setCoun(String coun) {
		this.coun = coun;
	}

}
