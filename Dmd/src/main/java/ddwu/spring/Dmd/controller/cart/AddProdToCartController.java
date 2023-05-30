package ddwu.spring.Dmd.controller.cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.CartItem;

@Controller
@RequestMapping("/order/Cart")
public class AddProdToCartController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String addProdToCart(@RequestParam(value="prodId") String id, 
								@RequestParam(value="prodQty", defaultValue="1") int qty,
								ModelMap model) {
		System.out.println("addProdToCart controller start");
		System.out.println("prodId: " +id+ "   prodQty: " +qty);
		
		CartItem cart = new CartItem("user123", id, qty, "n");
		model.put("cart", cart);
		
		return "/order/Cart";
	}

}
