package com.socgen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socgen.entity.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
