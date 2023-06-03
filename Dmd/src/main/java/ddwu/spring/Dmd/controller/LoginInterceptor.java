package ddwu.spring.Dmd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.util.WebUtils;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
			throws Exception {
		
		UserSession userSession = 
				(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		
		if(userSession == null) {
			String url = request.getRequestURL().toString(); 
			String query = request.getQueryString();
			ModelAndView modelAndView = new ModelAndView("LoginForm");
			
			if (query != null) {
				modelAndView.addObject("LoginForwardAction", url+"?"+query);
			}
			else {
				modelAndView.addObject("LoginForwardAction", url);
			}
			throw new ModelAndViewDefiningException(modelAndView);
			
		} else {
			return true;
		}
	
	
	}

}
