package ddwu.spring.Dmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order/Cart")
public class AddProdToCartController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String addProdToCart() {
		System.out.println("addProdToCart controller start");
		return "/order/Cart";
	}

}
