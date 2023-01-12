package com.training.springmvc.controller;

//import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springmvc.model.User;
import com.training.springmvc.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
//	@RequestMapping(value="/home",method=RequestMethod.GET)
//    public String printGreet(ModelMap map,HttpServletRequest request) {
//		map.addAttribute("msg","Srija");
//		String Name = request.getParameter("name");
//		String Password =request.getParameter("password");
//		if(Name.equals("srija") && Password.equals("Srija@123")) {
//			return "success";
//		}else {
//		return "error";
//    }
//	}
	@Autowired
	HomeService service;
	@RequestMapping(value="/home",method=RequestMethod.POST)
    public String printGreet(ModelMap map,@ModelAttribute("user") User user) {
		
		if(service.validate(user.getUserName(), user.getPassword())) {
			map.addAttribute("msg", "This value is set using ModelMap..");
			return "home";
		}
		else {
			map.addAttribute("error", "Incorrect Credentials!!");
			return "sample";
		}

//		if(user.getUserName().equals("srija") && user.getPassword().equals("Srija@123")) {
//			return "success";
//		}else {
//			
//	   map.addAttribute("error", "incorrect details");
//		return "sample";
//    }
	}
	@RequestMapping(method=RequestMethod.GET)
    public String login() {
    	return "sample";
    }
	
}
