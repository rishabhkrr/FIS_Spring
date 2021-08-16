package com.fis.employeeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
