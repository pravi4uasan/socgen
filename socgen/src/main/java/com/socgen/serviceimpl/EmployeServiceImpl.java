package com.socgen.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socgen.entity.Employee;
import com.socgen.repository.EmployeRepository;
import com.socgen.service.EmployeService;

@Component
public class EmployeServiceImpl  implements EmployeService{
	@Autowired
	private EmployeRepository employeRepository;

	public void saveEmployee(Employee employeeRequest) {
		
		employeRepository.save(employeeRequest);
		
		
	}

}
