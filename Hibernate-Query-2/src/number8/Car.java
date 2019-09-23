package number8;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="car")
public class Car  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="RegNo")
	private String RegNo;
	@Column(name="Model")
	private String Model;
	@Column(name="Color")
	private String Color;
	@Column(name="Manufacturer")
	private String Manufacturer;
	@Column(name="Price")
	private Long Price;
	
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public Long getPrice() {
		return Price;
	}
	public void setPrice(Long price) {
		Price = price;
	}
	

}
