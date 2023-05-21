package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import ddwu.spring.Dmd.domain.Product;

public interface ProductDAO {
	
	List<ProductDAO> getAllProduct() throws DataAccessException;
	
	List<ProductDAO> getByName(String searchName) throws DataAccessException;

	ProductDAO getProduct(String prodId) throws DataAccessException;
	
	List<ProductDAO> rangeByPrice(int price) throws DataAccessException;
	
	//category 
	List<Product> getProductListByCategory(int cateCode) throws DataAccessException;
}
