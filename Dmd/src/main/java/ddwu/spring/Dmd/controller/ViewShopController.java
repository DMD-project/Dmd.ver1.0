package ddwu.spring.Dmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/shop/shopMain")
public class ViewShopController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewProd() {
		System.out.println("shop main controller start");
		return "/shop/shopMain";
	}
	
//	public String viewProdByCategory(String id) {
//		
//		System.out.println("category = " + id);
//		
//		return "/shop/shopMain/{}";
//	}

	
}
