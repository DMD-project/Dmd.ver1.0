package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@RequestMapping("/secondHand/list")
//@SessionAttributes("userSession")
public class SecondHandController {
	
	private SecondHandFacade shFacade;

	@Autowired
	public void setShFacade(SecondHandFacade shFacade) {
		this.shFacade = shFacade;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, ModelMap model) throws Exception {
		UserSession userSession = 
				(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		PagedListHolder<SecondHand> shList = new PagedListHolder<SecondHand>(shFacade.findAll());
		shList.setPageSize(16);
		
		if(shList.getPage() != 0) {
			System.out.println("in SecondHand Controller\n" +shList.getSource().get(0).getContent());
		}
		
		model.put("secondHandList", shList);
		model.put("userSession", userSession);
		
		return "/secondHand/secondHand";
	}

}
