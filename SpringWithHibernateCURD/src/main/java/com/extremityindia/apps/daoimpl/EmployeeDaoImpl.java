package com.extremityindia.apps.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.extremityindia.apps.bean.Employee;
import com.extremityindia.apps.idao.IEmployeeDao;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.hibernateSessionFactory = sf;
	}

	public void addNewEmployee(Employee employee) {
		try {
			Session session = hibernateSessionFactory.openSession();
			session.saveOrUpdate(employee);
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee() {
		List<Employee> employeelist = null;
		try {
			Session session = hibernateSessionFactory.openSession();
			employeelist = session.createQuery("from Employee").list();
			System.out.println(employeelist);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeelist;
	}

	public void employeeDelete(int id) {
		try {
			Session session = hibernateSessionFactory.openSession();
			Employee employee=(Employee) session.load(Employee.class, id);
			System.out.println(employee.getName());
			if(employee!=null)
			{
				session.delete(employee);
				session.beginTransaction().commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> employeeEdit(int id) 
	{
		List<Employee> list=null;
		try {
			Session session = hibernateSessionFactory.openSession();
			Employee employee=(Employee) session.load(Employee.class, id);
			list=new ArrayList<Employee>();
			list.add(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void employeeupdate(Employee employee) {
		try {
			Session session = hibernateSessionFactory.openSession();
			System.out.println(employee.getId());
			/* Query qry = session.createQuery("update Employee e set e.name=? e.address=? e.age=? e.salary=? where e.id=?");
			 System.out.println(qry);
			 qry.setParameter(0,employee.getName());
			 qry.setParameter(1,employee.getAddress());
			 qry.setParameter(2,employee.getAge());
			 qry.setParameter(3,employee.getSalary());
			 qry.setParameter(4,employee.getId());
			 int res = qry.executeUpdate();
			 */
			session.update(employee);
			session.beginTransaction().commit();
			 System.out.println("Command successfully executed....");
			 //System.out.println("Numer of records effected due to update query"+res);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
