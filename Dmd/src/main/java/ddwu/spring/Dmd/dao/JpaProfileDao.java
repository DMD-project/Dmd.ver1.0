package ddwu.spring.Dmd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Profile;

@Repository
public class JpaProfileDao implements ProfileDao {
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public Profile getProfile(String id) throws DataAccessException {
		return em.find(Profile.class, id);
	}

	@Override
	public Profile getProfile(String id, String pw) throws DataAccessException {
		
		Query q = em.createQuery("Select a from Profile p "
								+ "where p.id=:id and p.pw=:pw", 
								Profile.class);
		q.setParameter("id", id);
		q.setParameter("pw", pw);
		
		Profile profile = null;
		try {
			profile = (Profile) q.getSingleResult();
			
		} catch(NoResultException e) {
			return null;
		}
		return profile;
	}

	
	@Override
	public void insertProfile(Profile profile) throws DataAccessException {
		em.persist(profile);
	}

	@Override
	public void updateProfile(Profile profile) throws DataAccessException {
		em.merge(profile);
	}
	
	@Override
	public void deleteProfile(Profile profile) throws DataAccessException {
		em.remove(profile);
	}

	@Override
	public List<String> getUsernameList() throws DataAccessException {
		Query query = em.createQuery(
				"select p.name from Profile p", String.class);
		return query.getResultList();
	}

}
