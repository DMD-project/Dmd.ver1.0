package ddwu.spring.Dmd.controller.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.CartFacade;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.domain.Cart;

@Controller
@RequestMapping("/shop/addProdToCart")
public class AddProdToCartController {
	
	@Autowired
	private CartFacade cartFacade;
	public void setCartFacade(CartFacade prodFacade) {
		this.cartFacade = cartFacade;
	}

	public String viewCart(@RequestParam(value="prodId") int id, 
			@ModelAttribute("sessionCart") Cart cart) throws Exception {
		
//			Cart cart = this.cartFacade.getCart(id);

			System.out.println("addProdToCart controller start");
		
//			model.put("cart", cart);
			
			return "/order/Cart";
	}
	
	
	
	
	
	
	
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String addProdToCart(@RequestParam(value="prodId") int id, 
//								@RequestParam(value="prodQty", defaultValue="1") int qty,
//								ModelMap model) {
//		System.out.println("addProdToCart controller start");
//		System.out.println("prodId: " +id+ "   prodQty: " +qty);
//		
//		CartItem cart = new CartItem("user123", id, qty, "n");
//		model.put("cart", cart);
//		
//		return "/order/Cart";
//	}

}
