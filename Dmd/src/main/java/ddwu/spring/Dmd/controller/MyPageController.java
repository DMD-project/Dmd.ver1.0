package ddwu.spring.Dmd.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ddwu.spring.Dmd.domain.GPBuyer;
import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.domain.Order;
import ddwu.spring.Dmd.domain.Profile;
import ddwu.spring.Dmd.domain.SecondHand;
import ddwu.spring.Dmd.service.GroupPurchaseFacade;
import ddwu.spring.Dmd.service.OrderFacade;
import ddwu.spring.Dmd.service.ProductFacade;
import ddwu.spring.Dmd.service.ProfileFacade;
import ddwu.spring.Dmd.service.SecondHandFacade;

@Controller
@SessionAttributes("userSession")
public class MyPageController {
	
	private ProfileFacade facade;
	private SecondHandFacade shFacade;
	private GroupPurchaseFacade gpFacade;
	private OrderFacade odFacade;
	private ProductFacade pFacade;
	
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
	
	@Autowired
	public void setOdFacade(OrderFacade odFacade) {
		this.odFacade = odFacade;
	}
	
	@Autowired
	public void setPFacade(ProductFacade pFacade) {
		this.pFacade = pFacade;
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
			return new ModelAndView("/profile/mypage", "profile", profile);
		}
		else {
			return new ModelAndView("index", "message", " ..... error msg");
		}
		
	}
	
	@RequestMapping("/profile/mypage/secondHandList")
	public String secondHandRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id,
			ModelMap model) throws Exception {
		
		ArrayList<SecondHand> shList = getSecondHand(id);
		
//		System.out.println(shList.get(0).getName());
		model.put("shList", shList);
		return "/profile/SecondHandList";
	}
	
	private ArrayList<SecondHand> getSecondHand(String id) {
		ArrayList<SecondHand> list = (ArrayList<SecondHand>) shFacade.findByBuyerID(id);
		return list;
	}
	
	@RequestMapping("/profile/mypage/groupPurchaseList")
	public String groupPurchaseRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id,
			ModelMap model) throws Exception {
		
		ArrayList<GroupPurchase> gpList = getGroupPurchase(id);
		
		//System.out.println(gpList.get(0).getName());
		model.put("gpList", gpList);
		return "/profile/GroupPurchaseList";
	}
	
	private ArrayList<GroupPurchase> getGroupPurchase(String id) {
		System.out.println("groupPurchase");
		ArrayList<GPBuyer> list = (ArrayList<GPBuyer>) gpFacade.findByUserId(id);

		ArrayList<GroupPurchase> gpList = new ArrayList<GroupPurchase>();
		
		for (int i = 0; i < list.size(); i++) {
			gpList.add(list.get(i).getGroupPurchase());
		}
		
		return gpList;
	}
	
	@RequestMapping("/profile/mypage/orderList")
	public String orderRequest(
			@ModelAttribute("userSession") UserSession userSession,
			@RequestParam(value="id") String id,
			ModelMap model) throws Exception {
		
		HashMap<Order, String> odMap = getOrder(id);
//		ArrayList<String> pnList = getProdName(id);
		
//		System.out.println(shList.get(0).getName());
		model.put("odMap", odMap);
//		model.put("pnList", pnList);
		return "/profile/orderList";
	}
	
	private HashMap<Order, String> getOrder(String id) throws Exception {
		
		HashMap<Order, String> map = new HashMap<Order, String>();
		
		ArrayList<Order> list = (ArrayList<Order>) odFacade.findByUserID(id);
		for(int i = 0; i < list.size(); i++) {
			String prodName = pFacade.getProduct(list.get(i).getProdID()).getName();
			map.put(list.get(i), prodName);
		}
		
		return map;
	}
	private ArrayList<String> getProdName(String id) throws Exception {
		
		ArrayList<String> odList = new ArrayList<String>();
		ArrayList<Order> list = (ArrayList<Order>) odFacade.findByUserID(id);
		for(int i = 0; i < list.size(); i++) {
			
			String prodName = pFacade.getProduct(list.get(i).getProdID()).getName();
			odList.add(prodName);
		}
		return odList;
	}

}
