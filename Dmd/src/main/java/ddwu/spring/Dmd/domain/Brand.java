package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="brand")
public class Brand implements Serializable {
	
	@Id
	@Column(name="id")
	private int brandCode;
	
	@Column(name="brandname")
	private String name;
	
	private String address;
	private String phone;
	
	public Brand(int brandCode, String name) {
		super();
		this.brandCode = brandCode;
		this.name = name;
	}
	
	public Brand(int brandCode, String name, String address, String phone) {
		super();
		this.brandCode = brandCode;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	public int getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(int brandCode) {
		this.brandCode = brandCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
