package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="category")
public class Category implements Serializable {
	@Id
	@Column(name="id")
	private int cateCode;
	@Column(name="categoryname")
	private String name;
	
	
	
	public Category(int cateCode, String name) {
		super();
		this.cateCode = cateCode;
		this.name = name;
	}
	
	public int getCateCode() {
		return cateCode;
	}
	public void setCateCode(int cateCode) {
		this.cateCode = cateCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
