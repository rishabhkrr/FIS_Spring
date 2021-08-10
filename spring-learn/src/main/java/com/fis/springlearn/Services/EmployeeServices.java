package com.fis.springlearn.Services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fis.springlearn.Deo.EmployeeDeo;

import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Component
public class EmployeeServices {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServices.class);
	
	private EmployeeDeo employeeDeo;
	
	public EmployeeServices() {
		LOGGER.debug("Inside Employee Services");
	}

	@Autowired
	public void setEmployeeDeo(EmployeeDeo employeeDeo) {
		this.employeeDeo = employeeDeo;
	}
	
	
}
