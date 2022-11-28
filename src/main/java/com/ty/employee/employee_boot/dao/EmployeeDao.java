package com.ty.employee.employee_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.ty.employee.employee_boot.Repository.EmployeeRepo;
import com.ty.employee.employee_boot.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo repo;
	
	
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	public String deleteEmployee(int id) {
		repo.deleteById(id);
		return "deleted";
	}
}
