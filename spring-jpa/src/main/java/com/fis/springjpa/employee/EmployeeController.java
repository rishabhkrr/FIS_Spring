package com.fis.springjpa.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fis.springjpa.User;

@Controller
@RequestMapping
public class EmployeeController {

	private EmployeeRepository employeeRepository;
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewEmployee (@RequestParam String name
	      , @RequestParam String department, @RequestParam int salary) {
		Employee e = new Employee();
		e.setName(name);
		e.setDepartment(department);
		e.setSalary(salary);
		employeeRepository.save(e);
		return "save";
	}
	
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Employee> getAllEmployees() {
	    // This returns a JSON or XML with the users
	    return employeeRepository.findAll();
	  }
}
