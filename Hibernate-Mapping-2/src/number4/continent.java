package number4;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Continent")
public class continent implements  Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "id", length=4)
	private int cid;
	
	@Column (name="ContinentName")
	private String cname;
	
	@ElementCollection
	private Map<country,capital> countries;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<country, capital> getCountries() {
		return countries;
	}
	public void setCountries(Map<country, capital> countries) {
		this.countries = countries;
	}
	
}
