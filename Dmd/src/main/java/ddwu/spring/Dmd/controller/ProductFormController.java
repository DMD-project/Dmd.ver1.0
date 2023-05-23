package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProductFormValidator;

@Controller
//@RequestMapping("/shop/addProduct")
@SessionAttributes("prodReq")
public class ProductFormController {

//	private ProductFacade prodFacade;

//	@Autowired
//	public void setProductFacde(ProductFacade prodFacade) {
//		this.prodFacade = prodFacade;
//	}

	@ModelAttribute("prodReq")
	public ProductForm formBacking() {
		ProductForm prodForm = new ProductForm();
		//초기화 할 것
		return prodForm;
	}

//	@ModelAttribute("brand")
//	public String[] brandID() {
//		return new String[] {"brnadA", "brandB"};
//
//	}

//	@RequestMapping("/shop/shopMain") //go shopmain(remove sessions)
//	public String goIndex(SessionStatus sessionStatus, HttpServletRequest rq)
//	{
//		HttpSession session = rq.getSession(false);
//
//		sessionStatus.setComplete();// session close
//		session.removeAttribute("prodForm");   //prodForm session close
//		session.removeAttribute("status");      //edit flag Session close
//
//		return "redirect:/shop/shopMain";
//	}

//	@GetMapping("/shop/shopMain/addProduct")
//	public String form(@ModelAttribute("prodReq") ProductForm prodForm, 
//			Model model, HttpServletRequest rq) {
//
//		HttpSession session = rq.getSession(false);
//		if(session.getAttribute("status") != null) {
//			int status = (int) session.getAttribute("status");
////			Product p = prodFacade.getProduct(status);
//			//				ProductForm.setListPrice(sh.getListPrice());
//
//		}
//		model.addAttribute("prodId", prodId);
//		return  "shop/addProduct";  
//	}

//	@PostMapping("/shop/secondHand/step3.do")      // step2 -> step3
//	public String goCheck(
//			@ModelAttribute("prodForm") ProductForm prodForm, BindingResult result,
//			Model model, HttpServletRequest rq) {   
//
//		HttpSession session = rq.getSession(false);
//		new ProductFormValidator().validate(prodForm, result);
//		ProductForm itemForm = (ProductForm)session.getAttribute("prodForm");
//
//		if (result.hasErrors()) {	//유효성 검증 에러 발생시
//			model.addAttribute("prodId", prodForm.getId());
//			return "shop/addProduct";
//		}
//
//		return "shop/product";      // step3(CHECK_FORM3)
//	}
//
//	@ModelAttribute("prodReq")
//	public ProductForm formBacking(HttpServletRequest rq, @RequestParam("prodId") String prodId) {
//		HttpSession session = rq.getSession(false);
//		ProductForm productForm;
//		//수정을 위한 addProductForm
//		if((ProductForm)session.getAttribute("productFrom") != null) {
//			ProductForm prodFormSession = (ProductForm) session.getAttribute("productForm");
//			System.out.println(prodFormSession);
//
//			return prodFormSession;
//		}
//		else {
//			productForm = new ProductForm();
//			productForm.setId(prodId);
//			return productForm;
//		}
//	}
	//	
	//	@RequestMapping(value="/shop/addProduct", method = RequestMethod.GET)
	//	public String step1(@ModelAttribute("prod") ProductForm productForm, @RequestParam("prodId") String prodId, Model model) {
	//		model.addAttribute("prodId", prodId);
	//		return "shop/shopMain";
	//	}
	@RequestMapping(value="/shop/addProduct", method = RequestMethod.GET)
	public String step1() {

		return "/product/AddProductForm";
	}

//	@RequestMapping(value="/shop/addProduct", method = RequestMethod.POST)
//	public String submit(@ModelAttribute("prod") ProductForm productForm, BindingResult bindingResult, 
//			@RequestParam("prodId") String prodId, HttpServlet rq, Model model ) {
//
//		new ProductFormValidator().validate(productForm, bindingResult);
//
//		String productController = "";
//		//		HttpSession httpSession = rq.getSession(true);
//
//		if (bindingResult.hasErrors()) {
//			model.addAttribute("prodId", prodId);
//			return "shop/shopMain";
//		}
//
//		productController = "redirect:/shop/shopMain/addProduct?prodId=" + prodId;
//
//		return productController;
//	}

}
