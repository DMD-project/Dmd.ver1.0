package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddwu.spring.Dmd.dao.GroupPurchaseDao;
import ddwu.spring.Dmd.domain.GroupPurchase;
@Service
public class GroupPurchaseService implements GroupPurchaseFacade{

	@Autowired
	private GroupPurchaseDao gpDao;
	
	public void setGpDao(GroupPurchaseDao gpDao) {
		this.gpDao = gpDao;
	}
	
	@Override
	public List<GroupPurchase> findAll() {
		// TODO Auto-generated method stub
		return gpDao.findAll();
	}

	@Override
	public void addGroupPurchase(GroupPurchase groupPurchase) {
		// TODO Auto-generated method stub
		gpDao.save(groupPurchase);
	}

}
