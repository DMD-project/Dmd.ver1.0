package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.service.ProfileFacade;

@Controller
@SessionAttributes("userSession")
public class LoginController {

	private ProfileFacade facade;
	
	@Autowired
	public void setFacade(ProfileFacade facade) {
		this.facade = facade;
	}
	
	@RequestMapping("/profile/login")
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam(value="id") String id,
			@RequestParam(value="pw") String pw,
			@RequestParam(value="forwardAction", required=false) String forwardAction,
			Model model) throws Exception {
		
		System.out.println("in loginController");
		
		Profile profile = facade.getProfile(id, pw);
		
		if(profile == null) {
			return new ModelAndView("/profile/LoginError", "message", 
					"Invalid id or password.  login failed.");
		} else {
			UserSession userSession = new UserSession(profile);
			
			/*PagedListHolder<Product> myList = new PagedListHolder<Product>(
					this.petStore.getProductListByCategory(
							account.getProfile().getFavouriteCategoryId()));
			myList.setPageSize(4);
			userSession.setMyList(myList);*/
			
			model.addAttribute("userSession", userSession);
			if (forwardAction != null) 
				return new ModelAndView("redirect:" + forwardAction);
			else 
				return new ModelAndView("redirect:/shop/shopMain");
		}
	}
	
	@RequestMapping("/profile/relogin")
	public String reLoginForm() {
		return "/profile/LoginForm";
	}
}
