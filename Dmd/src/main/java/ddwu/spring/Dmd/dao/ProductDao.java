package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Product;
@Repository
public interface ProductDao extends CrudRepository<Product, String>{
	//save, findById, count, delete
	
	List<Product> findByName(String name);
	List<Product> findByCateID(int cateID);
	
}
