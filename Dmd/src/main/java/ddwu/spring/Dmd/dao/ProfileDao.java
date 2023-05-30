package ddwu.spring.Dmd.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import ddwu.spring.Dmd.domain.Profile;

public interface ProfileDao {
	
	Profile getProfile(String id) throws DataAccessException; 
	
	void insertProfile(Profile profile) throws DataAccessException;
	
	void updateProfile(Profile profile) throws DataAccessException;
	
	void deleteProfile(Profile profile) throws DataAccessException;

	List<String> getUsernameList() throws DataAccessException;
}
