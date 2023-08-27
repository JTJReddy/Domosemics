package com.example.domosemics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.domosemics.user.User;

@Controller
@RequestMapping("/")
public class DomoController {

	
	@RequestMapping("/hello")
	public String hello() {
		return"index";
	}
	
	
	@RequestMapping(value="/a",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user ) {
		ModelAndView m = new ModelAndView();
		m.setViewName("next");
		m.addObject("name", user);
		return m;
		
	}
	
}
