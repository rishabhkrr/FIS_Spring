package com.fis.springlearn.Deo;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class EmployeeDeo {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeo.class);
	
	public EmployeeDeo() {
		LOGGER.debug("Inside Employee Deo");
	}
}
