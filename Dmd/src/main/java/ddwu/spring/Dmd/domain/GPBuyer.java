package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity

@Table(name="gpbuyer")
public class GPBuyer implements Serializable {

	@Id
	@SequenceGenerator(
			name = "gbp_seq_generator",
			sequenceName = "gpb_seq",
			initialValue = 5000,
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "gbp_seq_generator"
			)
	private int GPNum;
	@ManyToOne
	@JoinColumn(name="gpid")
	private GroupPurchase groupPurchase;
	@Column(name="userid")
	private String userId;

	public int getGPNum() {
		return GPNum;
	}

	public void setGPNum(int gPNum) {
		GPNum = gPNum;
	}

	public GroupPurchase getGroupPurchase() {
		return groupPurchase;
	}

	public void setGroupPurchase(GroupPurchase groupPurchase) {
		this.groupPurchase = groupPurchase;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GPBuyer(int gPNum, GroupPurchase groupPurchase, String userId) {
		super();
		GPNum = gPNum;
		this.groupPurchase = groupPurchase;
		this.userId = userId;
	}
	public GPBuyer(GroupPurchase groupPurchase, String userId) {
		super();
		this.groupPurchase = groupPurchase;
		this.userId = userId;
	}
	
	public GPBuyer() {
		
	}

	@Override
	public String toString() {
		return "GPBuyer [GPNum=" + GPNum + ", groupPurchase=" + groupPurchase + ", userId=" + userId + "]";
	}
	
	
	
}
