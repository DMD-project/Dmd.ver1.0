package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
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
	public ModelAndView handleRequest(HttpServletRequest request, @RequestParam(value="keyword", required=false) String keyword, @RequestParam(value="page", required=false) String page) throws Exception {
		if(keyword != null) {
			if (!StringUtils.hasLength(keyword)) {
				return new ModelAndView("Error", "message", "Please enter a keyword to search");
			}
			PagedListHolder<Product> productList = new PagedListHolder<Product>(this.facade.searchProductList(keyword));
			productList.setPageSize(16);
			request.getSession().setAttribute("SearchProductsController_productList", productList);
			return new ModelAndView("SearchProducts", "productList", productList);
		} else {
			@SuppressWarnings("unchecked")
			PagedListHolder<Product> productList = (PagedListHolder<Product>)request.getSession().getAttribute("SearchProductsController_productList");
			if (productList == null) {
				return new ModelAndView("Error", "message", "Your session has timed out");
			}
			if ("next".equals(page)) {
				productList.nextPage();
			} else if ("previous".equals(page)) {
				productList.previousPage();
			}
			return new ModelAndView("SearchProducts", "productList", productList);
		}
	}
}
