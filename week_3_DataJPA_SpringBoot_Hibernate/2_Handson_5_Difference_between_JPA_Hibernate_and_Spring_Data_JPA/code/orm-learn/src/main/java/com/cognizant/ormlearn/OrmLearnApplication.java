package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.HibernateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication  {
	@Autowired
	private EmployeeService employeeService;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		Employee employee = new Employee( "Vivek", "Engineering", 75000.0);
		EmployeeService jpaImplementation = context.getBean(EmployeeService.class);
		jpaImplementation.addEmployee(employee);
		HibernateEmployeeService hb = new HibernateEmployeeService();
		Employee employee1 = new Employee( "Max","Support",30000.0);
		hb.HibernateImplementationsave(employee1);
	}

}
