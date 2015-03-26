package com.extremityindia.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.extremityindia.apps.bean.Employee;
import com.extremityindia.apps.iservice.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeService iEmployeeService;

	@RequestMapping("/index")
	public ModelAndView viewIndexPage() {
		return new ModelAndView("redirect:getEmployeeList.htm");
		// return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/registerhere")
	public ModelAndView viewRegistration() {
		return new ModelAndView("registration");
	}

	@RequestMapping("/saveContact")
	public String saveEmployeeInoformation(@ModelAttribute Employee employee,
			BindingResult result) {
		try {
			iEmployeeService.addEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/index.htm";
	}

	@RequestMapping("/getEmployeeList.htm")
	public ModelAndView getEmployeeList() {
		List<Employee> list = null;
		try {
			list = iEmployeeService.employeeList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("welcome", "list", list);
	}

	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam int id)
	{
		System.out.println("id = " + id);
		try {
			iEmployeeService.deleteEmp(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/index.htm";
	}
	@RequestMapping(value = "/edit")
	public ModelAndView editPage(@RequestParam int id) 
	{
		System.out.println("id = " + id);
			List<Employee> list=iEmployeeService.editEmployee(id);
			return new ModelAndView("edit", "list", list);
	}
	
	@RequestMapping("/updateContact")
	public String updateEmployeeInoformation(@ModelAttribute Employee employee,
			BindingResult result) {
		try {
			iEmployeeService.updateEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/index.htm";
	}
	
	
}
