package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import ddwu.spring.Dmd.domain.Category;

public interface CategoryDao {
	
	List<Category> getCategoryList() throws DataAccessException;
	
	Category getCategory(int cateCode) throws DataAccessException;

}
