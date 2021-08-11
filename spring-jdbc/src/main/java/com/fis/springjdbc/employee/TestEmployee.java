package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);

		System.out.println("===============================");
		System.out.println("Insert a Employee");
		Employee newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("eraser");
		newEmployee.setDepartment("XAS");
		newEmployee.setSalary(12334334);
		newEmployee.setId(20);
		newEmployee.setName("eraser");
		newEmployee.setDepartment("XAS");
		newEmployee.setSalary(12334334);
		bean.insertProduct(newEmployee);
		System.out.println("===============================");
		System.out.println("Delete Employee");
		int id = 30;
		bean.deleteEmployee(id);
		System.out.println("===============================");
		System.out.println("Get Product Based on Id");
		id = 20;
		Employee productById = bean.getEmployeeById(id);
		System.out.println(productById);
		System.out.println("===============================");
		System.out.println("Update Product");
		newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("browneraser");
		bean.updateEmployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Get All Products");
		System.out.println(bean.getAllEmployee());
		System.out.println("===============================");

		context.close();
	}

}
