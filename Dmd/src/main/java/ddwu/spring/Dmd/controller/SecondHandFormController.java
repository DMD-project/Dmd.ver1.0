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
@SessionAttributes("secondHand")
public class SecondHandFormController {

	@Autowired
	SecondHandFacade facade;
	
	public void setFacade(SecondHandFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("secondHand")
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
		
		System.out.println(shForm.getSecondHand().getName());
		
		facade.addSecondHand(shForm.getSecondHand());
		return "/secondHand/secondHand";
		
	}
}
