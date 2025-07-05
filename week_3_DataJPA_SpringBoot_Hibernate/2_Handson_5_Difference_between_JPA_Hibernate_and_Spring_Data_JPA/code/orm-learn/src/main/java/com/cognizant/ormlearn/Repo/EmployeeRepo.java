package com.cognizant.ormlearn.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormlearn.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
