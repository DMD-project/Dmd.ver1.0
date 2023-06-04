package ddwu.spring.Dmd.controller;

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
		
		
		
		//productForm.getProduct().setId();
		
		validator.validate(productForm, result);
		
		if(result.hasErrors())
			return "product/AddProductForm";
		
		//save
		facade.addProduct(productForm.getProduct());
		
		return "shop/shopMain";
		
	}

	
}
