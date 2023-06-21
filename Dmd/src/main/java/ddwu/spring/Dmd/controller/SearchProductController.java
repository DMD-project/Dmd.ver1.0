package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;

@Controller
public class SearchProductController {
	
	@Autowired
	private ProductFacade facade;
	
	public void setProductFacade(ProductFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping("/shop/search")
	public String handleRequest(HttpServletRequest request, 
			@RequestParam(value="keyword", required=false) String keyword,
			ModelMap model
//			,@RequestParam(value="page", required=false) String page
			) throws Exception {
		
		System.out.println(keyword);
		
		if(keyword != null) {
			if (!StringUtils.hasLength(keyword)) {
//				return new ModelAndView("Error", "message", "Please enter a keyword to search");
			}
			
			PagedListHolder<Product> productList = new PagedListHolder<Product>(this.facade.searchProductList(keyword));
			productList.setPageSize(16);
			request.getSession().setAttribute("SearchProductsController_productList", productList);
			
			model.put("productList", productList);
			
			return "/shop/shopMain";
		} else {
			@SuppressWarnings("unchecked")
			PagedListHolder<Product> productList = (PagedListHolder<Product>)request.getSession().getAttribute("SearchProductsController_productList");
			if (productList == null) {
//				return new ModelAndView("Error", "message", "Your session has timed out");
			}
//			if ("next".equals(page)) {
//				productList.nextPage();
//			} else if ("previous".equals(page)) {
//				productList.previousPage();
//			}
			model.put("productList", productList);
			
			return "redirect:/shop/shopMain";
		}
	}
}
