package com.socgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.entity.Employee;
import com.socgen.service.EmployeService;

@RestController
public class EmployeeController {
	
  @Autowired
  EmployeService employeService;
  
  @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
  
  public void saveEmployeDetails(@RequestBody Employee request) {
	  
	  employeService.saveEmployee(request);
	  
  }
 
 

}
