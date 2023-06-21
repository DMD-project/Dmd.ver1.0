package ddwu.spring.Dmd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.Brand;
import ddwu.spring.Dmd.domain.Category;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;

@Controller
@RequestMapping("/product/update")
public class UpdateProductController {
	
	@Autowired
	private ProductFacade facade;
	
	public void setFacade(ProductFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("cateCodes")
	protected List<Category> referenceData1() throws Exception {
		List<Category> cateCodes = new ArrayList<Category>(); //id 9000 ~ 1
		cateCodes.add(new Category(9000, "가구"));
		cateCodes.add(new Category(9001, "페브릭"));
		cateCodes.add(new Category(9002, "조명"));
		cateCodes.add(new Category(9003,"수납/정리"));
		cateCodes.add(new Category(9004,"소품"));
		cateCodes.add(new Category(9005,"식물"));
		return cateCodes;
	}
	
	@ModelAttribute("brandCodes") //8000~ 1
	protected List<Brand> referenceData2() throws Exception {
		List<Brand> brandCodes = new ArrayList<Brand>();
		brandCodes.add(new Brand(8000, "참나무"));
		brandCodes.add(new Brand(8001,"아이닉"));
		brandCodes.add(new Brand(8002, "마틸라"));
		brandCodes.add(new Brand(8003, "최고심"));
		brandCodes.add(new Brand(8004, "mash!"));
		brandCodes.add(new Brand(8005, "우드공장"));
		brandCodes.add(new Brand(8006,"apple"));
		brandCodes.add(new Brand(8007, "LG"));
		brandCodes.add(new Brand(8008, "삼성"));
		return brandCodes;
	}
	@ModelAttribute("prodReq")
	public ProductForm formBacking(HttpServletRequest request) {
		ProductForm productForm = new ProductForm();
		return productForm;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(@RequestParam("id") int id, ModelMap model) throws Exception {
		Product product = facade.getProduct(id);
		model.put("product", product);
		
		System.out.println(product.getName());
		
		return "shop/UpdateProductForm";
		
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public String update(@ModelAttribute("prodReq") ProductForm pForm) throws Exception {
		
		System.out.println("update product controller");
		
		Product product = pForm.getProduct();
		Product newProduct = facade.getProduct(product.getId());
		
		newProduct.setName(product.getName());
		newProduct.setCateID(product.getCateID());
		newProduct.setBrandID(product.getBrandID());
		newProduct.setPrice(product.getPrice());
		newProduct.setContent(product.getContent());
		
		facade.updateProduct(newProduct);
		
		return "redirect:/shop/product?prodId=" + product.getId();
		
	}

}
