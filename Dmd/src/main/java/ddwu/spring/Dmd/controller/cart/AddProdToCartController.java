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

import ddwu.spring.Dmd.controller.UserSession;
import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.service.CartFacade;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProfileFacade;
import ddwu.spring.Dmd.domain.Cart;

@Controller
@RequestMapping("/shop/addProdToCart")
@SessionAttributes("userSession")
public class AddProdToCartController {
	
	@Autowired
	private CartFacade cartFacade;
	public void setCartFacade(CartFacade prodFacade) {
		this.cartFacade = cartFacade;
	}
	
	@Autowired
	private ProductFacade pFacade;
	public void setPFacade(ProductFacade pFacade) {
		this.pFacade = pFacade;
	}
	
	@Autowired
	private ProfileFacade profileFacade;
	
	public void setProfileFacade(ProfileFacade profileFacade) { 
		this.profileFacade = profileFacade;
	}
	@RequestMapping(method = RequestMethod.GET)
	public String viewCart(@RequestParam(value="prodId") int id, UserSession userSession,
			@ModelAttribute("sessionCart") Cart cart, ModelMap model) throws Exception {
		
//			Cart cart = this.cartFacade.getCart(id);
		
		Product product = pFacade.getProduct(id);

		System.out.println("addProdToCart controller start");
		
		Profile profile = userSession.getProfile();
		
		
		
//		model.put("cart", cart);
		model.put("product", product);
		model.put("profile", profile);
			
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
