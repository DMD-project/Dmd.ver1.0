package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.GroupPurchase;

@SuppressWarnings("serial")
public class GroupPurchaseForm implements Serializable {
	private GroupPurchase groupPurchase;
	
	public GroupPurchaseForm() {
		this.groupPurchase = new GroupPurchase();
	}
	
	public GroupPurchase getGroupPurchase() {
		return groupPurchase;
	}
}
