package ddwu.spring.Dmd.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

import ddwu.spring.Dmd.domain.Brand;
import ddwu.spring.Dmd.domain.Category;
import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.service.GroupPurchaseFacade;

@Controller
@RequestMapping("/groupPurchase/add")
@SessionAttributes("groupPurchase")
public class GroupPurchaseFormController {

	@Autowired
	GroupPurchaseFacade facade;
	
	public void setFacade(GroupPurchaseFacade facade) {
		this.facade = facade;
	}
	
	@ModelAttribute("cateCodes")
	protected List<Category> referenceData1() throws Exception {
		List<Category> cateCodes = new ArrayList<Category>(); //id 9000 ~ 1
		cateCodes.add(new Category(9000, "가구"));
		cateCodes.add(new Category(9001, "페브릭"));
		cateCodes.add(new Category(9002, "조명"));
		cateCodes.add(new Category(9003,"수납/정리"));
		cateCodes.add(new Category(9004,"소품"));
		cateCodes.add(new Category(9005,"식물"));
		return cateCodes;
	}
	
	@ModelAttribute("brandCodes") //8000~ 1
	protected List<Brand> referenceData2() throws Exception {
		List<Brand> brandCodes = new ArrayList<Brand>();
		brandCodes.add(new Brand(8000, "참나무"));
		brandCodes.add(new Brand(8001,"아이닉"));
		brandCodes.add(new Brand(8002, "마틸라"));
		brandCodes.add(new Brand(8003, "최고심"));
		brandCodes.add(new Brand(8004, "mash!"));
		brandCodes.add(new Brand(8005, "우드공장"));
		brandCodes.add(new Brand(8006,"apple"));
		brandCodes.add(new Brand(8007, "LG"));
		brandCodes.add(new Brand(8008, "삼성"));
		return brandCodes;
	}
	
	@ModelAttribute("groupReq")
	public GroupPurchaseForm formBacking(HttpServletRequest request) {
		GroupPurchaseForm GPForm = new GroupPurchaseForm();
		return GPForm;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "product/AddGroupPurchase";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("groupReq") GroupPurchaseForm GPForm, BindingResult result, SessionStatus status) throws Exception {
		
		System.out.println("GroupPurchaseFormController submit");
//		
		System.out.println(GPForm.getGroupPurchase().getName());
		
		GroupPurchase product = GPForm.getGroupPurchase();
		product.setState("N");
		
		//save
		facade.addGroupPurchase(product);
		
		status.setComplete();
		
		return "redirect:/groupPurchase/list";
		
	}
	
	
}
