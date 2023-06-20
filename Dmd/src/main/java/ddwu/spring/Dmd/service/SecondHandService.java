package ddwu.spring.Dmd.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ddwu.spring.Dmd.dao.SecondHandDao;
import ddwu.spring.Dmd.domain.SecondHand;

@Service
@Transactional
public class SecondHandService implements SecondHandFacade {

	@PersistenceContext
    private EntityManager em;
	
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

	@Override
	public SecondHand getSecondHand(int id) {
		Optional<SecondHand> result = shDao.findById(id);
		if(result.isPresent()) return result.get();
		return null;
	}

	@Override
	public void updateBuyRequest(SecondHand secondHand) throws DataAccessException {
		System.out.println("in SecondHand Service " +secondHand.getName());
		em.merge(secondHand);
	}

	@Override
	public void updateSecondHand(SecondHand secondHand) throws DataAccessException {
		em.merge(secondHand);
	}

	@Override
	public void deleteById(int id) {
		Optional<SecondHand> result = shDao.findById(id);
		if(result.isPresent()) {
			shDao.delete(result.get());
		}
	}

	@Override
	public List<SecondHand> findByBuyerID(String id) {
		return (List<SecondHand>) shDao.findByBuyerID(id);
	}

}
