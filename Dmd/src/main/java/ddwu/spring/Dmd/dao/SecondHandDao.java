package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.SecondHand;

@Repository
public interface SecondHandDao extends CrudRepository<SecondHand, String>{

	List<SecondHand> findAll();
	
//	s<S> S save(SecondHand secondHand);
}
