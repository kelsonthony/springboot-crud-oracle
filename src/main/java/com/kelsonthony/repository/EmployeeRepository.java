package com.kelsonthony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelsonthony.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	 
    Employee findByFirstName(String name);
 
}
