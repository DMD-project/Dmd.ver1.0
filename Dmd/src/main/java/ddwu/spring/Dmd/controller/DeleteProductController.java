package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.service.ProductFacade;

@Controller
@RequestMapping("/product/delete")
public class DeleteProductController {
	
	private ProductFacade facade;
	
	@Autowired
	public void setFacade(ProductFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String delete(@RequestParam("id") int id) throws Exception {
		facade.deleteById(id);
		
		return "redirect:/shop/shopMain";
	}

}
