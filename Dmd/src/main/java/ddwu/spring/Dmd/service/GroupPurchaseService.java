package ddwu.spring.Dmd.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddwu.spring.Dmd.dao.GroupPurchaseDao;
import ddwu.spring.Dmd.domain.GroupPurchase;
@Service
@Transactional
public class GroupPurchaseService implements GroupPurchaseFacade{

	
	@PersistenceContext
	private EntityManager em;
	
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

	@Override
	public GroupPurchase getProduct(int gpId) throws Exception {
		// TODO Auto-generated method stub
		Optional<GroupPurchase> result = gpDao.findById(gpId);
		if(result.isPresent()) {
			GroupPurchase product = result.get();
			return product;
		} else {
			throw new Exception();
		}
	}

	@Override
	public void updateBuyRequest(GroupPurchase gp) {
		// TODO Auto-generated method stub
		em.merge(gp);
	}

}
