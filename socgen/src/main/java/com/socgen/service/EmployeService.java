package com.socgen.service;

import java.util.List;
import java.util.Optional;

import com.socgen.entity.Employee;

public interface EmployeService {
	
	public int saveEmployee(Employee employeeRequest);
	public List<Employee> listofEmployees();
	public Optional<Employee> employeDetails(int id);

}
