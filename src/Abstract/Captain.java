package Abstract;

import java.util.Date;

public class Captain extends Person {
	private String lisence;
	private Date expiry;
	private String permittedVehicleType;
	
	public Captain(String name) {
		super(name);
		this.lisence = "xyz";
		this.expiry = new Date();
		this.permittedVehicleType = "Small boats";
	}
	
	public String getLisence() {
		return lisence;
	}
	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public String getPermittedVehicleType() {
		return permittedVehicleType;
	}
	public void setPermittedVehicleType(String permittedVehicleType) {
		this.permittedVehicleType = permittedVehicleType;
	}
	
	
}
