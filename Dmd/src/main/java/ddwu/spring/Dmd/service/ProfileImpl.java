package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ddwu.spring.Dmd.dao.ProfileDao;
import ddwu.spring.Dmd.domain.Profile;

@Service
@Transactional
public class ProfileImpl implements ProfileFacade {

	@Autowired 
	@Qualifier("jpaProfileDao")
	private ProfileDao profileDao;
	
	@Override
	public Profile getProfile(String id) {
		return profileDao.getProfile(id);
	}
	
	@Override
	public Profile getProfile(String id, String pw) {
		return profileDao.getProfile(id, pw);
	}

	@Override
	public void insertProfile(Profile profile) {
		profileDao.insertProfile(profile);
	}

	@Override
	public void updateProfile(Profile profile) {
		profileDao.updateProfile(profile);
	}

	@Override
	public void deleteProfile(Profile profile) {
		profileDao.deleteProfile(profile);
	}

	@Override
	public List<String> getUsernameList() {
		return profileDao.getUsernameList();
	}

}
