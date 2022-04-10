package com.inhatc.cs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhatc.cs.HomeController;
import com.inhatc.domain.ManagerVO;

public class ManagerController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	public String logincheck(ManagerVO vo,HttpServletRequest req) {
		logger.info("login");
		
		//技记 积己
		HttpSession session = req.getSession();
		
//		ManagerVO res = service.login(vo);
		ManagerVO res;
		
		if(res !=null) {
			session.setAttribute("res", res);
			return "redirect:list.do";
		} else {
			return "redirect:login.do";
		}
		
	}
}
