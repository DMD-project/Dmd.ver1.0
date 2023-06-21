package ddwu.spring.Dmd.controller.cart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import ddwu.spring.Dmd.controller.UserSession;
import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.service.CartFacade;
import ddwu.spring.Dmd.service.ProfileFacade;

@Controller
@RequestMapping("/shop/viewCart")
@SessionAttributes("userSession")
public class ViewCartController {
	@Autowired
	private CartFacade facade;
	
	@Autowired
	private ProfileFacade pFacade;
	
	
	public void setFacade(CartFacade facade) {
		this.facade = facade;
	}
	
	public void setPFacade(ProfileFacade pFacade) {
		this.pFacade = pFacade;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String viewProd(@RequestParam("prodId") int prodId,
//			ModelMap model) throws Exception {
//		
//		Cart cart = this.facade.getCart(prodId);
//		model.put("cart", cart);
//		
//		return "order/Cart";
//	}
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id) throws Exception {
		
		Profile profile = pFacade.getProfile(id);
		System.out.println("view cart controller" + profile.getName());
		System.out.println("usersession" + userSession.getProfile().getName());
		if(userSession.getProfile().getId() != null) {
			return new ModelAndView("/order/Cart2", "profile", profile);
		} else {
			return new ModelAndView("/", "message", " ..... error msg");
		}
		
//		facade.findByUserId(id);
	}
	
}


//@Controller
//@SessionAttributes("sessionCart")
//public class ViewCartController {
//	@ModelAttribute("sessionCart")
//	public Cart createCart(HttpSession session) {
//		Cart cart = (Cart)session.getAttribute("sessionCart");
//		if (cart == null) cart = new Cart();
//		return cart;
//	}
//	
//	@GetMapping("/shop/viewCart")
//	public ModelAndView viewCart(
//			HttpServletRequest request,
//			@RequestParam(value="page", required=false) String page,
//			@ModelAttribute("sessionCart") Cart cart) 
//			throws Exception {
//		UserSession userSession = 
//			(UserSession) WebUtils.getSessionAttribute(request, "userSession");
//		handleRequest(page, cart, userSession);
		
//		System.out.print("viewCart controller start");
//		
//		return new ModelAndView("order/Cart", "cart", cart);
//	}

//	@RequestMapping("/shop/checkout")
//	public ModelAndView checkout(
//			HttpServletRequest request,
//			@RequestParam(value="page", required=false) String page,
//			@ModelAttribute("sessionCart") Cart cart) 
//			throws Exception {
//		UserSession userSession = 
//			(UserSession) WebUtils.getSessionAttribute(request, "userSession");
//		handleRequest(page, cart, userSession);
//		return new ModelAndView("order/Checkout", "cart", cart);
//	}
//	
//	private void handleRequest(String page, Cart cart, UserSession userSession)
//			throws Exception {
//		if (userSession != null) {
//			if ("next".equals(page)) {
//				userSession.getMyList().nextPage();
//			}
//			else if ("previous".equals(page)) {
//				userSession.getMyList().previousPage();
//			}
//		}
//		if ("nextCart".equals(page)) {
//			cart.getCartItemList().nextPage();
//		}
//		else if ("previousCart".equals(page)) {
//			cart.getCartItemList().previousPage();
//		}
//	}
//}
