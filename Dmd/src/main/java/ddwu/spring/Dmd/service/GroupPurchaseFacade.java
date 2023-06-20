package ddwu.spring.Dmd.service;

import java.util.List;

import ddwu.spring.Dmd.domain.GPBuyer;
import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.domain.Profile;

public interface GroupPurchaseFacade {
	List<GroupPurchase> findAll();
	
	void addGroupPurchase(GroupPurchase groupPurchase);
	
	GroupPurchase getProduct(int gpId) throws Exception;
	
	void updateBuyRequest(GroupPurchase gp);
	
	List<Profile> findByGroupPurchase(int id);
	
	List<GroupPurchase> findByUserId(String id);
	
	void addGPBuyer(GPBuyer gpb);
	
	void changeGPState(GroupPurchase gp);
	
}
