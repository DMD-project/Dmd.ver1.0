package ddwu.spring.Dmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.Order;
import ddwu.spring.Dmd.service.OrderFacade;

@Controller
@SessionAttributes("userSession")
public class ViewOrderController {
	
	
}