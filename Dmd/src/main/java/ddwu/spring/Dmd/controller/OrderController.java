package ddwu.spring.Dmd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.util.WebUtils;

import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.OrderFacade;
import ddwu.spring.Dmd.service.OrderFormValidator;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProfileFacade;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
//@RequestMapping("/shop/addOrder")
//@SessionAttributes({"sessionCart", "orderForm"})
public class OrderController {

	
	
	
}