package com.socgen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.entity.Employee;
import com.socgen.service.EmployeService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class EmployeeController {
	
  @Autowired
  EmployeService employeService;
  
  @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
  
  public void saveEmployeDetails(@RequestBody Employee request) {
	  
	  int id=employeService.saveEmployee(request);
	  log.info("response id>>>>>>>>>"+id);
	  
  }
  
  @GetMapping(value="/employees")
  public List<Employee> listofEmployess(){
	return employeService.listofEmployees();
	  
  }
 
  @GetMapping(value="/employee/{id}")
  public Optional<Employee> employee(@PathVariable (name = "id") int id) {
	return employeService.employeDetails(  id);
	  
  }
 

}
