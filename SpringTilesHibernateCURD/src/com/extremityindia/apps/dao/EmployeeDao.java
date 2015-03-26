package com.extremityindia.apps.dao;

import java.util.List;

import com.extremityindia.apps.model.*;
/**
 * @author Rahul Moundekar
 *
 */
public interface EmployeeDao {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
