package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.service.ProductFacade;

@Controller
@RequestMapping("/shop/shopMain")
public class ViewShopController {
	
	private ProductFacade productFacade;
	
	@Autowired
	public void setProductFacade(ProductFacade productFacade) {
		this.productFacade = productFacade;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewProd() {
		
		System.out.println("shop main controller start");
		return "/shop/shopMain";
	}
	
	@RequestMapping()
	public ModelAndView viewShop() {
		return new ModelAndView("shoMain", "productList", productFacade.getAllProducts());
	}

	
}
