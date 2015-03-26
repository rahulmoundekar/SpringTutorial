package com.extremityindia.apps.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.extremityindia.apps.bean.Employee;
import com.extremityindia.apps.idao.IEmployeeDao;
import com.extremityindia.apps.iservice.*;

public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDao iEmployeeDao;

	public void addEmployee(Employee employee) {
		iEmployeeDao.addNewEmployee(employee);
	}

	public List<Employee> employeeList() {
		return iEmployeeDao.listEmployee();
	}

	public void deleteEmp(int id) {
		iEmployeeDao.employeeDelete(id);
	}

	public List<Employee> editEmployee(int id) {
		return iEmployeeDao.employeeEdit(id);
	}

	public void updateEmployee(Employee employee) {
		iEmployeeDao.employeeupdate(employee);
	}

}
