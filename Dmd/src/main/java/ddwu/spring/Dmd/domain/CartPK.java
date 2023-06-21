package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Entity;

//@Entity
public class CartPK implements Serializable {
	private int prodId;
	private String userId;
	public int getPordId() {
		return prodId;
	}
	public void setPordId(int pordId) {
		this.prodId = pordId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
