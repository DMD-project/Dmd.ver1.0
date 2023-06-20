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
	
	@RequestMapping("/shop/addItemToCart")
	public ModelAndView handleRequest(
			@RequestParam("workingItemId") int workingProdId,
			@RequestParam("productId") int productId,
			@ModelAttribute("sessionCart") Cart cart 
			) throws Exception {
		if (cart.containsItemId(workingProdId)) {
			cart.incrementQuantityByItemId(workingProdId);
		}
//		else {
			// isInStock is a "real-time" property that must be updated
			// every time an item is added to the cart, even if other
			// item details are cached.
//			System.out.println("workingItemId : " + workingProdId);
//			System.out.println("productId : " + productId);
			
//			Product prod = null;
//			switch(productId) {
//				case 0:
//					prod = this.prodFacade.getGroupBuyingProd(workingItemId);
//					break;
//				case 1:
//					prod = this.prodFacade.getAuctionById(workingItemId);
//					break;
//				case 2:
//					prod = this.prodFacade.getSecondHandProd(workingItemId);
//					break;
//				case 3:
//					prod = this.prodFacade.getHandMadeById(workingItemId);
//					break;
//			}
			
//			boolean isInStock = this.prodFacade.isItemInStock(workingProdId, prod.getProductId());
//			cart.addItem(prod, isInStock);
//		}
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
