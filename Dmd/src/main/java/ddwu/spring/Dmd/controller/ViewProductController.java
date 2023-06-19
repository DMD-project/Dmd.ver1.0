package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProductService;

@Controller
@RequestMapping("/shop/product")
public class ViewProductController {
	
	private ProductFacade facade;
	
	@Autowired
	public void setProductFacade(ProductFacade facade) {
		this.facade = facade;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String viewProd(@RequestParam("prodId") int prodId,
			ModelMap model) throws Exception {
		
		Product product = this.facade.getProduct(prodId);
		model.put("product", product);
		
		
		return "shop/ViewProduct";
	}
	
}
