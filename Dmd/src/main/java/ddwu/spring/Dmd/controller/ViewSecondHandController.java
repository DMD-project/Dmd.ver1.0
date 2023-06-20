package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
public class ViewSecondHandController {
	
	@Autowired
	private SecondHandFacade facade;
	
	public void setFacade(SecondHandFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping("/secondHand/viewSH")
	public String handleRequest(@RequestParam("id") int id,
			ModelMap model) throws Exception {
		
		SecondHand sh = this.facade.getSecondHand(id);
		model.put("secondHand", sh);
		
		return "/secondHand/ViewSecondHand";
	}
	
	@RequestMapping("/secondHand/buy")
	public String buyReqeust(@RequestParam("id") int id,
			@RequestParam("buyerId") String buyerId,
			ModelMap model) throws Exception {
		
		SecondHand sh = this.facade.getSecondHand(id);
		
		sh.setBuyerID(buyerId);
		sh.setWantFlag('y');
		sh.setSellerFlag('y');
		
		facade.updateBuyRequest(sh);
		model.put("secondHand", sh);
		
		return "/secondHand/ViewSecondHand";
	}
	
	@RequestMapping("/secondHand/delete")
	public String delete(@RequestParam("id") int id) throws Exception {
		
		facade.deleteById(id);
		
		return "redirect:/secondHand/list";
	}
}
