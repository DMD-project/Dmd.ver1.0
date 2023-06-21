package ddwu.spring.Dmd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ddwu.spring.Dmd.domain.Brand;
import ddwu.spring.Dmd.domain.Category;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProductFormValidator;


@Controller
@RequestMapping("/shop/addProduct")
@SessionAttributes("prodReq")
public class ProductFormController {
	
	@Autowired
	private ProductFacade facade;
	public void setFacade(ProductFacade facade) {
		this.facade = facade;
	}
	
	@Autowired
	private ProductFormValidator validator;
	public void setValidator(ProductFormValidator validator) {
		this.validator = validator;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "product/AddProductForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("prodReq") ProductForm productForm, BindingResult result, SessionStatus status) throws Exception {
		
		System.out.println("productFormController submit");
		
		//productForm.getProduct();
		
//		validator.validate(productForm, result);
//		
//		if(result.hasErrors()) {
//			System.out.println("validator occur");
//			return "product/AddProductForm";
//		}
//		
		System.out.println(productForm.getProduct().toString());
		
		Product newProduct = productForm.getProduct();
		newProduct.setProdIMGUrl("../../../../images/cup.png");
		//save
		facade.addProduct(newProduct);
		
		status.setComplete();
		
		return "redirect:/shop/shopMain";
		
	}

	
}
