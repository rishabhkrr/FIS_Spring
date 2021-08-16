package com.fis.employeeservice;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class EmployeeInitializer implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;
	EmployeeInitializer(EmployeeRepository employeeRepository){
		this.employeeRepository=employeeRepository;
	}
	 @Override
	    public void run(String... args) throws Exception {
	        Stream.of("Asha", "Manisha", "yogesh", "Vikas", "samrut", "vandana", "anvi")
	                .forEach(item -> employeeRepository.save(new Employee(item)));

	        employeeRepository.findAll().forEach(System.out::println);
	    }
}
