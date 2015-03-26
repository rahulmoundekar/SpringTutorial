package com.extremityindia.apps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.extremityindia.apps.pojo.*;

@Controller
@RequestMapping("/employee/add.htm")
public class EmployeeController 
{
	@RequestMapping(method = RequestMethod.GET)
	ModelAndView add(HttpServletRequest request, HttpServletResponse response)
			throws Exception 
			{
				Employee employee = new Employee();
				return new ModelAndView("addemployee", "employee", employee);

			}	
}
