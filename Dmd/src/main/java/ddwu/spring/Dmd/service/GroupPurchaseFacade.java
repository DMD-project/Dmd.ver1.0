package ddwu.spring.Dmd.service;

import java.util.List;

import ddwu.spring.Dmd.domain.GroupPurchase;

public interface GroupPurchaseFacade {
	List<GroupPurchase> findAll();
	
	void addGroupPurchase(GroupPurchase groupPurchase);
	
	GroupPurchase getProduct(int gpId) throws Exception;
	
	void updateBuyRequest(GroupPurchase gp);
	
}
