package com.extremityindia.apps.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringMVCController 
{
   @RequestMapping("/helloWorld.web")
    public String printWelcome(ModelMap model, HttpServletRequest 
	    request, HttpServletResponse response) {

	model.addAttribute("message", "Spring MVC jQuery"
		+ " Autocomplete");
	return "helloWorld";

    }
    

    @RequestMapping(value = "/getMachedNames.web", method = 
	    RequestMethod.GET)
    public @ResponseBody
    List<String> getMachedNames(@RequestParam("term") String name){
	
	List<String> matchName = DataCache.getName(name);

	return matchName;
    }
}