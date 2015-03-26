package com.extremityindia.apps.iservice;

import java.util.List;

import com.extremityindia.apps.bean.Employee;

public interface IEmployeeService 
{
	public void addEmployee(Employee employee);
	public List<Employee> employeeList();
	public void deleteEmp(int id); 
	public List<Employee> editEmployee(int id);
	public void updateEmployee(Employee employee);
}
