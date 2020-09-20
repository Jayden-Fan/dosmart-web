package com.dounion.dosmart.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dounion.dosmart.login.entity.UcenterUser;

@Controller
@RequestMapping("/index")
public class LoginController {
	
	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UcenterUser ucenterUser) {
		if (ucenterUser != null) {
			String account = ucenterUser.getAccount();
			String password = ucenterUser.getPassword();
			if (account.equals("admin")) {
				Map<String, Object> dataMap = new HashMap<String, Object>();
				dataMap.put("url", "index/map.do");
				return "index/map.do";
			}
		}
		return "redirect:/index/map";
	}*/
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> login(UcenterUser ucenterUser) {
		if (ucenterUser != null) {
			String account = ucenterUser.getAccount();
			String password = ucenterUser.getPassword();
			if (account.equals("admin")) {
				Map<String, Object> dataMap = new HashMap<String, Object>();
				dataMap.put("success", true);
				return dataMap;
			}
		}
		return null;
	}
	
	/*@RequestMapping("/map")
	public ModelAndView map() {
		ModelAndView mav = new ModelAndView("forward:/WEB-INF/page/html/map.html");
        return mav;
	}*/
	
	@RequestMapping("/map")
	public String map() {
        return "map";
	}

}
