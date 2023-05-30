package ddwu.spring.Dmd.service;

import java.util.List;
import ddwu.spring.Dmd.domain.Profile;

public interface ProfileFacade {
	
	Profile getProfile(String id);
	
	void insertProfile(Profile profile);

	void updateProfile(Profile profile);
	
	void deleteProfile(Profile profile);

	List<String> getUsernameList();

}
