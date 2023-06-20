package ddwu.spring.Dmd.service;

import java.util.List;
import ddwu.spring.Dmd.domain.SecondHand;

public interface SecondHandFacade {

	List<SecondHand> findAll();
	
	List<SecondHand> findByBuyerID(String id);
	
	SecondHand getSecondHand(int id);
	
	void updateSecondHand(SecondHand secondHand);
	
	void updateBuyRequest(SecondHand secondHand);
	
	void addSecondHand(SecondHand secondHand);
	
	void deleteById(int id);
}
