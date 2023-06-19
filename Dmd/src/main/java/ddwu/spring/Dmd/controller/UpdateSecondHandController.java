package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@RequestMapping("/secondHand/update")
public class UpdateSecondHandController {

	@Autowired
	private SecondHandFacade facade;
	
	public void setFacade(SecondHandFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("secondHand")
	public SecondHandForm formBacking(HttpServletRequest request) {
		SecondHandForm secondHandForm = new SecondHandForm();
		return secondHandForm;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(@RequestParam("id") int id,
			ModelMap model) {
//		System.out.println(id);
//		
		SecondHand sh = this.facade.getSecondHand(id);
		System.out.println(sh.getContent());
		model.put("sh", sh);
		
		return "/secondHand/secondHandUpdateForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String update(@RequestParam("id") int id,
			ModelMap model) throws Exception {
//		SecondHand sh = 
//		facade.updateSecondHand(shForm.getSecondHand());
		
		return "secondHand/ViewSecondHand";
	}
}
