package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddwu.spring.Dmd.dao.SecondHandDao;
import ddwu.spring.Dmd.domain.SecondHand;

@Service
public class SecondHandService implements SecondHandFacade {

	@Autowired
	private SecondHandDao shDao;

	public void setShDao(SecondHandDao shDao) {
		this.shDao = shDao;
	}

	@Override
	public List<SecondHand> findAll() {
		return (List<SecondHand>) shDao.findAll();
	}

	@Override
	public void addSecondHand(SecondHand secondHand) {
		shDao.save(secondHand);
	}

}
