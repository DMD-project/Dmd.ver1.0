//package ddwu.spring.Dmd.controller.cart;
//import java.util.Iterator;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.servlet.ModelAndView;
//
//import ddwu.spring.Dmd.domain.Cart;
//import ddwu.spring.Dmd.domain.CartItem;
//
//@Controller
//@SessionAttributes("sessionCart")
//
//public class UpdateCartQuantitiesController {
//	@RequestMapping("/shop/updateCartQuantities")
//	public ModelAndView handleRequest(
//			HttpServletRequest request,	
//			@ModelAttribute("sessionCart") Cart cart) throws Exception {
//		Iterator<CartItem> cartItems = cart.getAllCartProducts();
//		while (cartItems.hasNext()) {
//			CartItem cartItem = (CartItem) cartItems.next();
//			int ProductId = cartItem.getProd().getId();
//			try {
//				int quantity = Integer.parseInt(request.getParameter(String.valueOf(ProductId)));
//				cart.setQuantityByProductId(ProductId, quantity);
//				if (quantity < 1) {
//					cartItems.remove();
//				}
//			}
//			catch (NumberFormatException ex) {
//				// ignore on purpose
//			}
//		}
//		return new ModelAndView("order/Cart", "cart", cart);
//	}
//}
