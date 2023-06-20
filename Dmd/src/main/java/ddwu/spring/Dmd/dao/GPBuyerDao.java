package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.GPBuyer;
import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.domain.Profile;

@Repository
public interface GPBuyerDao extends CrudRepository<GPBuyer, Integer>{
	//save, findById, count, delete
	
	List<GroupPurchase> findByUserId(String userId);
	List<Profile> findByGroupPurchase(int gpId);
}
