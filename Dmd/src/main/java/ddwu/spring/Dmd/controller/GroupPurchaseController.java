package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.service.GroupPurchaseFacade;

@Controller
@RequestMapping("/groupPurchase/list")
public class GroupPurchaseController {
	
	@Autowired
	private GroupPurchaseFacade facade;
	
	
	public void setGPFacade(GroupPurchaseFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, ModelMap model) throws Exception {
		UserSession userSession = 
				(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		PagedListHolder<GroupPurchase> gpList = new PagedListHolder<GroupPurchase>(facade.findAll());
		gpList.setPageSize(16);
		
//		System.out.println("in SecondHand Controller\n" +shList.getSource().get(0).getName());
		
		model.put("groupPurchaseList", gpList);
		model.put("userSession", userSession);
		
		return "/groupPurchase/groupPurchase";
	}
	
}
