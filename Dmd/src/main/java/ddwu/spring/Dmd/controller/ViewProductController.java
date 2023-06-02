package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductService;

@Controller
@RequestMapping("/shop/product")
public class ViewProductController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewProd(@RequestParam("prodId") String prodId,
			ModelMap model) {
		
		Product product = new Product(100001, 1000002, "good chair", 1002342, 23200, "content", "url");
		model.put("product", product);
		
		return "/shop/ViewProduct";
	}
	
	
//	private ProductService prodService;

//	@Autowired
//	public void setPetStore(ProductService prodService) {
//		this.prodService = prodService;
//	}
//
//	@RequestMapping("/shop/product")
//	public String handleRequest(@RequestParam("prodId") String prodId,
//			ModelMap model) throws Exception {
//		
//		ProductDAO product = this.prodService.getProduct(prodId);
//		
//		model.put("product", product);
//		
//		return "Product";
//	}
}
