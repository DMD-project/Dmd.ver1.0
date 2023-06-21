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

import ddwu.spring.Dmd.domain.CartItem;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.domain.Cart;

@Controller
@SessionAttributes("sessionCart")
public class AddProdToCartController {
	private ProductFacade prodFacade;

	@Autowired
	public void setProductFacade(ProductFacade prodFacade) {
		this.prodFacade = prodFacade;
	}

	@ModelAttribute("sessionCart")
	public Cart createCart() {
		return new Cart();
	}

	@RequestMapping("/shop/addProdToCart")
	public ModelAndView handleRequest(
			@RequestParam(value="prodId") int id, 
			@ModelAttribute("sessionCart") Cart cart) throws Exception {
		if (cart.containsProductId(id)) {
			cart.incrementQuantityByeProductId(id);
			System.out.println("addProdToCart controller startincrement");

		} else {
			System.out.println("prodId : " + id);
			Product product = this.prodFacade.getProduct(id);
			cart.addProduct(product);
			System.out.println("addProdToCart controller start");

			
		}
		System.out.println("addProdToCart controller start");

		
		return new ModelAndView("order/Cart", "cart", cart);
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
