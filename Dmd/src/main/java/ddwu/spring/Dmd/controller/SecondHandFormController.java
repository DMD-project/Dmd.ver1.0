package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@RequestMapping("/secondHand/add")
//@SessionAttributes("secondHand")
public class SecondHandFormController {

	@Autowired
	SecondHandFacade facade;
	
	public void setFacade(SecondHandFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("secondHandForm")
	public SecondHandForm formBacking(HttpServletRequest request) {
		SecondHandForm shForm = new SecondHandForm();
		return shForm;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "/secondHand/secondHandForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("secondHand") SecondHandForm shForm,
			BindingResult result, SessionStatus status) {
		
		System.out.println("in SecondHandForm Controller > submit()");
		
		String sellerID = "";
		if(session.getAttribute("userSession") != null) {
			UserSession userSession = (UserSession)session.getAttribute("userSession") ;
	         if (userSession != null) {
	            sellerID = userSession.getProfile().getId();
	            System.out.println(sellerID);
	            shForm.getSecondHand().setSellerID(sellerID);
	            shForm.getSecondHand().setWantFlag('y');
	            shForm.getSecondHand().setSellerFlag('n');
	         }
		}
		
		System.out.println(shForm.getSecondHand().getName());
		
		facade.addSecondHand(shForm.getSecondHand());
		
		status.setComplete();
		return "redirect:/secondHand/list";
	}
}
