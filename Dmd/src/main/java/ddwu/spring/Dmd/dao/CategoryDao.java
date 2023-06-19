package ddwu.spring.Dmd.dao;

import org.springframework.data.repository.CrudRepository;

import ddwu.spring.Dmd.domain.Product;

public interface CategoryDao extends CrudRepository<Product, Integer>{

	//save, findById, count, delete
}
