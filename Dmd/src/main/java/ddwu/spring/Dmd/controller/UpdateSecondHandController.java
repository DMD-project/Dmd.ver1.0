package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@RequestMapping("/secondHand/update")
//@SessionAttributes("secondHand")
public class UpdateSecondHandController {

	@Autowired
	private SecondHandFacade facade;
	
	public void setFacade(SecondHandFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("secondHandForm")
	public SecondHandForm formBacking(HttpServletRequest request) {
		SecondHandForm shForm = new SecondHandForm();
		return shForm;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(@RequestParam("id")int id,
			ModelMap model) {
		
		SecondHand sh = facade.getSecondHand(id);
		model.put("sh", sh);
		
		System.out.println(sh.getName());
		
		return "/secondHand/secondHandUpdateForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String update(@ModelAttribute("secondHandForm") SecondHandForm shForm) {
		
		SecondHand sh = shForm.getSecondHand();
//		System.out.println(sh.getId());
		SecondHand newSH = facade.getSecondHand(sh.getId());
		
		newSH.setName(sh.getName());
		newSH.setPrice(sh.getPrice());
		if(sh.getContent().length() != 0) {
			newSH.setContent(sh.getContent());
		}
		
		facade.updateSecondHand(newSH);
		
		return "redirect:/secondHand/viewSH?id="+sh.getId();
	}
}
