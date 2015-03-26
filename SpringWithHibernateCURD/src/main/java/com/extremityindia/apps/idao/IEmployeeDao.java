package com.extremityindia.apps.idao;

import java.util.List;

import com.extremityindia.apps.bean.Employee;

public interface IEmployeeDao {

	public void addNewEmployee(Employee employee);
	public List<Employee> listEmployee();
	public void employeeDelete(int id);
	public List<Employee> employeeEdit(int id);
	public void employeeupdate(Employee employee);
}
