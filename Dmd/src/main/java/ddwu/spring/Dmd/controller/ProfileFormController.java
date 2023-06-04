package ddwu.spring.Dmd.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ddwu.spring.Dmd.service.ProfileFacade;
import ddwu.spring.Dmd.service.ProfileFormValidator;

@Controller
@RequestMapping({"/profile/add","/profile/update"})
@SessionAttributes("profile")
public class ProfileFormController {
	
	@Autowired
	private ProfileFacade facade;
	
	public void setFacade(ProfileFacade facade) {
		this.facade = facade;
	}

	@Autowired
	private ProfileFormValidator validator;
	public void setValidator(ProfileFormValidator validator) {
		this.validator = validator;
	}
	
	@ModelAttribute("profile")
	public ProfileForm formBacking(HttpServletRequest request) {
		ProfileForm profileForm = new ProfileForm();
		return profileForm;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "profile/AddProfileForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("profile") ProfileForm profileForm,
			BindingResult result, SessionStatus status) throws Exception {
		
		System.out.println("in ProfileFormController > submit()");
		
		profileForm.getProfile().setId(
				profileForm.getProfile().getId());
		System.out.println(profileForm.getProfile().getId());
		validator.validate(profileForm, result);
		
		if(result.hasErrors()) 
			return "profile/AddProfileForm";
		
		if(profileForm.isNewProfile()) {
			System.out.println("new profile");
			facade.insertProfile(profileForm.getProfile());
		} else {
			System.out.println("already exist profile");
			
			//facade.updateProfile(profileForm.getProfile());
		}
		/*
		try {
			if(profileForm.isNewProfile()) {
				System.out.println("new profile");
				facade.insertProfile(profileForm.getProfile());
			} else {
				System.out.println("already exist profile");
				//facade.updateProfile(profileForm.getProfile());
			}
		} catch(DataIntegrityViolationException ex) {
			result.rejectValue("profile.id", "USER_ID_ALREADY_EXISTS",
					"User ID already exists: choose a different ID.");
			return "profile/AddProfileForm"; 
		}
		*/
		
		UserSession userSession = new UserSession(
				facade.getProfile(profileForm.getProfile().getId()));
		/*PagedListHolder<Product> myList = new PagedListHolder<Product>(
			petStore.getProductListByCategory(
					accountForm.getAccount().getProfile().getFavouriteCategoryId()));
		myList.setPageSize(4);
		userSession.setMyList(myList);*/
		session.setAttribute("userSession", userSession);
		
		status.setComplete();
		return "profile/AddSuccess";
		//return "index";
	}
}
