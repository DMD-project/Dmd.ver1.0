package ddwu.spring.Dmd.controller.cart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Cart;

public class RemoveProdFromCartController {
	@RequestMapping("/shop/removeProdFromCart")
	public ModelAndView handleRequest(@RequestParam("prodId") int id,
			@ModelAttribute("sessionCart") Cart cart) throws Exception {
		cart.removeProductById(id);
		return new ModelAndView("order/Cart", "cart", cart);
	}
}
