package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.Category;
import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.service.ProductFacade;

@Controller
@RequestMapping("shop/category")
public class ViewShopCategoryController {
	
	private ProductFacade facade;
	
	@Autowired
	public void setProductFacade(ProductFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewProd(@RequestParam("cateCode") int cateCode,
			ModelMap model) throws Exception {
		
		System.out.println("shop category controller start");
		PagedListHolder<Product> prodList = new PagedListHolder<Product>(this.facade.getProductListByCategory(cateCode));
		prodList.setPageSize(16);

		model.put("productList", prodList);
		return "/shop/shopMain";

	}
}
