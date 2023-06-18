package ddwu.spring.Dmd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddwu.spring.Dmd.dao.ProductDao;
import ddwu.spring.Dmd.domain.Product;

@Service
public class ProductService implements ProductFacade{
	
	@Autowired
	private ProductDao prodDao;
	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}
	
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		prodDao.save(product);
	}
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Product> getProductListByCategory(String cateId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> searchProductList(String keywords) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) prodDao.findAll();
	}


	@Override
	public Product getProduct(int productId) throws Exception {
		// TODO Auto-generated method stub
		Optional<Product> result = prodDao.findById(productId);
		if(result.isPresent()) {
			Product product = result.get();
			return product;
		} else {
			throw new Exception();
		}
		
	}
	
	
}
