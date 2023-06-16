package ddwu.spring.Dmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.service.ProfileFacade;

@Controller
@SessionAttributes("userSession")
public class MyPageController {
	
private ProfileFacade facade;
	
	@Autowired
	public void setFacade(ProfileFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping("/profile/mypage")
	public ModelAndView handleRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id) throws Exception {
		
		Profile profile = facade.getProfile(id);
		
		if(userSession.getProfile().getId().equals(profile.getId())) {
			return new ModelAndView("/profile/mypage", "profile", profile);
		}
		else {
			return new ModelAndView("index", "message", " ..... error msg");
		}
		
	}

}
