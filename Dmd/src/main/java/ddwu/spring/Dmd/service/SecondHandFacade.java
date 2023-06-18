package ddwu.spring.Dmd.service;

import java.util.List;

import ddwu.spring.Dmd.domain.SecondHand;

public interface SecondHandFacade {

	List<SecondHand> findAll();
	
	void addSecondHand(SecondHand secondHand);
}
