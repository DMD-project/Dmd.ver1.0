package ddwu.spring.Dmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order/Cart")
public class AddProdToCartController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String addProdToCart(@RequestParam(value="prodId") String id, 
								@RequestParam(value="prodQty", defaultValue="1") int qty) {
		System.out.println("addProdToCart controller start");
		System.out.println("prodId: " +id+ "   prodQty: " +qty);
		return "/order/Cart";
	}

}
