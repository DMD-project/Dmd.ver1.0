package ddwu.spring.Dmd.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.GroupPurchaseFacade;
import ddwu.spring.Dmd.service.ProfileFacade;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@SessionAttributes("userSession")
public class MyPageController {
	
	private ProfileFacade facade;
	private SecondHandFacade shFacade;
	private GroupPurchaseFacade gpFacade;
	
	@Autowired
	public void setFacade(ProfileFacade facade) {
		this.facade = facade;
	}
	
	@Autowired
	public void setShFacade(SecondHandFacade shFacade) {
		this.shFacade = shFacade;
	}
	
	@Autowired
	public void setGpFacade(GroupPurchaseFacade gpFacade) {
		this.gpFacade = gpFacade;
	}
	
	@ModelAttribute("profile")
	public String formBacking(HttpServletRequest request) {
		return "/index";
	}
	
	@RequestMapping("/profile/mypage")
	public ModelAndView handleRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id) throws Exception {
		
		Profile profile = facade.getProfile(id);
		
		if(userSession.getProfile().getId().equals(profile.getId())) {
			
			ArrayList<SecondHand> shList = getSecondHand(id);
			System.out.println(shList.get(0).getName()+ " / " +shList.get(1).getName());
			
			return new ModelAndView("/profile/mypage", "profile", profile);
		}
		else {
			return new ModelAndView("index", "message", " ..... error msg");
		}
		
	}
	
	private ArrayList<SecondHand> getSecondHand(String id) {
		ArrayList<SecondHand> list = (ArrayList<SecondHand>) shFacade.findByBuyerID(id);
		return list;
	}
	

	
	

}
