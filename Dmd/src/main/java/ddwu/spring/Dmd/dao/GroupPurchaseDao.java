package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.GroupPurchase;

@Repository
public interface GroupPurchaseDao extends CrudRepository<GroupPurchase, Integer>{

	List<GroupPurchase> findAll();
}
