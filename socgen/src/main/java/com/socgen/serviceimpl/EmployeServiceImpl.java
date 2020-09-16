package com.socgen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socgen.entity.Employee;
import com.socgen.repository.EmployeRepository;
import com.socgen.service.EmployeService;

@Component
public class EmployeServiceImpl  implements EmployeService{
	@Autowired
	private EmployeRepository employeRepository;

	public int saveEmployee(Employee employeeRequest) {
		
		Employee id=employeRepository.save(employeeRequest);
		return id.getId();
		
		
	}

	@Override
	public List<Employee> listofEmployees() {
		
		return employeRepository.findAll();
	}

	@Override
	public Optional<Employee> employeDetails(int id) {
		
		return employeRepository.findById(id);
	}

}
