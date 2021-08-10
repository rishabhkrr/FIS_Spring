package com.fis.springlearn.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fis.springlearn.Services.EmployeeServices;

@Component
@Configuration
@ComponentScan("com.fis.springlearn")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private EmployeeServices employeeService;

	public EmployeeController() {
		LOGGER.debug("Inside Employee Controller");
	}
	

	@Autowired
	public void setEmployeeService(EmployeeServices employeeService) {
		this.employeeService = employeeService;
	}
	
}
