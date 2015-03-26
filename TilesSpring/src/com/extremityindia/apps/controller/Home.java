package com.extremityindia.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello", "message", "Body Content goes Here !");
	}
	@RequestMapping("/success")
	public ModelAndView success() {
		return new ModelAndView("success", "message", "Body Content goes Here !");
	}
}
